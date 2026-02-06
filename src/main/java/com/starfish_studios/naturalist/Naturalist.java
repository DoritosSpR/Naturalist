package com.starfish_studios.naturalist;

import com.starfish_studios.naturalist.entity.*;
import com.starfish_studios.naturalist.registry.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import org.jetbrains.annotations.NotNull;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import eu.midnightdust.lib.config.MidnightConfig;

@Mod(Naturalist.MOD_ID)
public class Naturalist {
    public static final String MOD_ID = "naturalist";
    public static final Logger LOGGER = LogManager.getLogger();

    public Naturalist(ModContainer modContainer, IEventBus modEventBus) {
        init();

        MidnightConfig.init("naturalist", NaturalistConfig.class);

        NaturalistRegistries.BLOCKS.register(modEventBus);
        NaturalistRegistries.ITEMS.register(modEventBus);
        NaturalistRegistries.SOUND_EVENTS.register(modEventBus);
        NaturalistRegistries.ENTITY_TYPES.register(modEventBus);
        NaturalistRegistries.POTIONS.register(modEventBus);
        NaturalistRegistries.RECIPE_TYPES.register(modEventBus);
        NaturalistRegistries.RECIPE_SERIALIZERS.register(modEventBus);
        NaturalistCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        NaturalistBiomeModifiers.BIOME_MODIFIER_SERIALIZERS.register(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::createAttributes);
        modEventBus.addListener(this::registerSpawnPlacements);
    }

    public static void init() {
        NaturalistRegistry.init();
        NaturalistBlockEntities.init();
        NaturalistSoundEvents.init();
        NaturalistEntityTypes.init();
        NaturalistRecipes.register();
    }

    public static void registerDispenserBehaviors() {
        DispenserBlock.registerBehavior(NaturalistRegistry.DUCK_EGG.get(), new ProjectileDispenseBehavior(NaturalistRegistry.DUCK_EGG.get()));

        DispenseItemBehavior dispenseItemBehavior = new DefaultDispenseItemBehavior() {
            private final DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();

            @SuppressWarnings("deprecation")
            public @NotNull ItemStack execute(@NotNull BlockSource source, ItemStack stack) {
                DispensibleContainerItem dispensibleContainerItem = (DispensibleContainerItem) stack.getItem();
                BlockPos blockPos = source.pos().relative(source.state().getValue(DispenserBlock.FACING));
                Level level = source.level();
                if (dispensibleContainerItem.emptyContents(null, level, blockPos, null)) {
                    dispensibleContainerItem.checkExtraContent(null, level, stack, blockPos);
                    return new ItemStack(Items.BUCKET);
                } else {
                    return this.defaultDispenseItemBehavior.dispense(source, stack);
                }
            }
        };
        DispenserBlock.registerBehavior(NaturalistRegistry.SNAIL_BUCKET.get(), dispenseItemBehavior);
        DispenserBlock.registerBehavior(NaturalistRegistry.BASS_BUCKET.get(), dispenseItemBehavior);
        DispenserBlock.registerBehavior(NaturalistRegistry.CATFISH_BUCKET.get(), dispenseItemBehavior);


        DispenserBlock.registerBehavior(NaturalistRegistry.SNAIL_BUCKET.get(), new DefaultDispenseItemBehavior() {
            public @NotNull ItemStack execute(@NotNull BlockSource source, @NotNull ItemStack stack) {
                Direction direction = source.state().getValue(DispenserBlock.FACING);
                BlockPos blockPos = source.pos().relative(direction);
                ServerLevel serverLevel = source.level();
                Snail snail = NaturalistEntityTypes.SNAIL.get().spawn(serverLevel, stack, null, blockPos, MobSpawnType.DISPENSER, true, false);
                if (snail != null) {
                    CustomData customData = stack.get(DataComponents.CUSTOM_DATA);
                    if (customData != null) {
                        snail.setSnailColor(Snail.Color.getTypeById(customData.copyTag().getInt("Color")));
                    }
                    stack.shrink(1);
                    return new ItemStack(Items.BUCKET);
                }
                return stack;
            }
        });
        DispenserBlock.registerBehavior(NaturalistRegistry.BUTTERFLY.get(), new DefaultDispenseItemBehavior() {
            public @NotNull ItemStack execute(@NotNull BlockSource source, @NotNull ItemStack stack) {
                Direction direction = source.state().getValue(DispenserBlock.FACING);
                BlockPos blockPos = source.pos().relative(direction);
                ServerLevel serverLevel = source.level();
                Butterfly butterfly = NaturalistEntityTypes.BUTTERFLY.get().spawn(serverLevel, stack, null, blockPos, MobSpawnType.DISPENSER, true, false);
                if (butterfly != null) {
                    CustomData customData = stack.get(DataComponents.CUSTOM_DATA);
                    if (customData != null) {
                        butterfly.setVariant(Butterfly.Variant.getTypeById(customData.copyTag().getInt("Variant")));
                    }
                    stack.shrink(1);
                }

                return stack;
            }
        });
    }

    public static void registerCompostables() {
        NaturalistRegistries.registerCompostable(0.65F, NaturalistRegistry.SNAIL_SHELL.get());
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            registerCompostables();
            registerDispenserBehaviors();
        });
    }

    private void createAttributes(@NotNull EntityAttributeCreationEvent event) {
        event.put(NaturalistEntityTypes.SNAIL.get(), Snail.createAttributes().build());
        event.put(NaturalistEntityTypes.BEAR.get(), Bear.createAttributes().build());
        event.put(NaturalistEntityTypes.BUTTERFLY.get(), Butterfly.createAttributes().build());
        event.put(NaturalistEntityTypes.FIREFLY.get(), Firefly.createAttributes().build());
        event.put(NaturalistEntityTypes.SNAKE.get(), Snake.createAttributes().build());
        event.put(NaturalistEntityTypes.CORAL_SNAKE.get(), Snake.createAttributes().build());
        event.put(NaturalistEntityTypes.RATTLESNAKE.get(), Snake.createAttributes().build());
        event.put(NaturalistEntityTypes.DEER.get(), Deer.createAttributes().build());
        event.put(NaturalistEntityTypes.BLUEJAY.get(), Bird.createAttributes().build());
        event.put(NaturalistEntityTypes.CANARY.get(), Bird.createAttributes().build());
        event.put(NaturalistEntityTypes.CARDINAL.get(), Bird.createAttributes().build());
        event.put(NaturalistEntityTypes.ROBIN.get(), Bird.createAttributes().build());
        event.put(NaturalistEntityTypes.FINCH.get(), Bird.createAttributes().build());
        event.put(NaturalistEntityTypes.SPARROW.get(), Bird.createAttributes().build());
        event.put(NaturalistEntityTypes.CATERPILLAR.get(), Caterpillar.createAttributes().build());
        event.put(NaturalistEntityTypes.RHINO.get(), Rhino.createAttributes().build());
        event.put(NaturalistEntityTypes.LION.get(), Lion.createAttributes().build());
        event.put(NaturalistEntityTypes.ELEPHANT.get(), Elephant.createAttributes().build());
        event.put(NaturalistEntityTypes.ZEBRA.get(), AbstractHorse.createBaseHorseAttributes().build());
        event.put(NaturalistEntityTypes.GIRAFFE.get(), Giraffe.createAttributes().build());
        event.put(NaturalistEntityTypes.HIPPO.get(), Hippo.createAttributes().build());
        event.put(NaturalistEntityTypes.VULTURE.get(), Vulture.createAttributes().build());
        event.put(NaturalistEntityTypes.BOAR.get(), Boar.createAttributes().build());
        event.put(NaturalistEntityTypes.DRAGONFLY.get(), Dragonfly.createAttributes().build());
        event.put(NaturalistEntityTypes.CATFISH.get(), Catfish.createAttributes().build());
        event.put(NaturalistEntityTypes.ALLIGATOR.get(), Alligator.createAttributes().build());
        event.put(NaturalistEntityTypes.BASS.get(), AbstractFish.createAttributes().build());
        event.put(NaturalistEntityTypes.LIZARD.get(), Lizard.createAttributes().build());
        event.put(NaturalistEntityTypes.LIZARD_TAIL.get(), LizardTail.createAttributes().build());
        event.put(NaturalistEntityTypes.MOOSE.get(), Moose.createAttributes().build());
        event.put(NaturalistEntityTypes.TORTOISE.get(), Tortoise.createAttributes().build());
        event.put(NaturalistEntityTypes.DUCK.get(), Duck.createAttributes().build());
    }

    private void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        var replace = RegisterSpawnPlacementsEvent.Operation.REPLACE;
        event.register(NaturalistEntityTypes.SNAIL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules, replace);
        event.register(NaturalistEntityTypes.BEAR.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.BUTTERFLY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Butterfly::checkButterflySpawnRules, replace);
        event.register(NaturalistEntityTypes.FIREFLY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Firefly::checkFireflySpawnRules, replace);
        event.register(NaturalistEntityTypes.SNAKE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Snake::checkSnakeSpawnRules, replace);
        event.register(NaturalistEntityTypes.CORAL_SNAKE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Snake::checkSnakeSpawnRules, replace);
        event.register(NaturalistEntityTypes.RATTLESNAKE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Snake::checkSnakeSpawnRules, replace);
        event.register(NaturalistEntityTypes.DEER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);

        event.register(NaturalistEntityTypes.BLUEJAY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Bird::checkBirdSpawnRules, replace);
        event.register(NaturalistEntityTypes.CANARY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Bird::checkBirdSpawnRules, replace);
        event.register(NaturalistEntityTypes.CARDINAL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Bird::checkBirdSpawnRules, replace);
        event.register(NaturalistEntityTypes.ROBIN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Bird::checkBirdSpawnRules, replace);
        event.register(NaturalistEntityTypes.FINCH.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Bird::checkBirdSpawnRules, replace);
        event.register(NaturalistEntityTypes.SPARROW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Bird::checkBirdSpawnRules, replace);

        event.register(NaturalistEntityTypes.RHINO.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.LION.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.ELEPHANT.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.ZEBRA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.GIRAFFE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.HIPPO.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Hippo::checkHippoSpawnRules, replace);
        event.register(NaturalistEntityTypes.VULTURE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Vulture::checkVultureSpawnRules, replace);
        event.register(NaturalistEntityTypes.BOAR.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.DRAGONFLY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Dragonfly::checkDragonflySpawnRules, replace);
        event.register(NaturalistEntityTypes.CATFISH.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, WaterAnimal::checkSurfaceWaterAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.ALLIGATOR.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Alligator::checkAlligatorSpawnRules, replace);
        event.register(NaturalistEntityTypes.BASS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, WaterAnimal::checkSurfaceWaterAnimalSpawnRules, replace);
        event.register(NaturalistEntityTypes.LIZARD.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules, replace);
        event.register(NaturalistEntityTypes.TORTOISE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules, replace);
        event.register(NaturalistEntityTypes.DUCK.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Duck::checkDuckSpawnRules, replace);
    }
}
