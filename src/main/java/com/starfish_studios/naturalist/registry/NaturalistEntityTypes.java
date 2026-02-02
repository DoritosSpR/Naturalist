package com.starfish_studios.naturalist.registry;

import com.starfish_studios.naturalist.entity.*;
import com.starfish_studios.naturalist.entity.core.projectile.ThrownDuckEgg;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class NaturalistEntityTypes {
    public static final Supplier<EntityType<Alligator>> ALLIGATOR = NaturalistRegistries.registerEntityType("alligator", Alligator::new, MobCategory.CREATURE, 1.8F, 0.8F, 10);
    public static final Supplier<EntityType<Bass>> BASS = NaturalistRegistries.registerEntityType("bass", Bass::new, MobCategory.WATER_AMBIENT, 0.7f, 0.4f, 4);
    public static final Supplier<EntityType<Bear>> BEAR = NaturalistRegistries.registerEntityType("bear", Bear::new, MobCategory.CREATURE, 1.4F, 1.7F, 1.7F * 0.75F, 10);
    public static final Supplier<EntityType<Bird>> BLUEJAY = NaturalistRegistries.registerEntityType("bluejay", Bird::new, MobCategory.CREATURE, 0.5F, 0.6F, 0.6F * 0.6F, 8);
    public static final Supplier<EntityType<Boar>> BOAR = NaturalistRegistries.registerEntityType("boar", Boar::new, MobCategory.CREATURE, 0.9f, 0.9f, 10);
    public static final Supplier<EntityType<Butterfly>> BUTTERFLY = NaturalistRegistries.registerEntityType("butterfly", Butterfly::new, MobCategory.AMBIENT, 0.7F, 0.6F, 8);
    public static final Supplier<EntityType<Bird>> CANARY = NaturalistRegistries.registerEntityType("canary", Bird::new, MobCategory.CREATURE, 0.5F, 0.6F, 0.6F * 0.6F, 8);
    public static final Supplier<EntityType<Bird>> CARDINAL = NaturalistRegistries.registerEntityType("cardinal", Bird::new, MobCategory.CREATURE, 0.5F, 0.6F, 0.6F * 0.6F, 8);
    public static final Supplier<EntityType<Caterpillar>> CATERPILLAR = NaturalistRegistries.registerEntityType("caterpillar", Caterpillar::new, MobCategory.CREATURE, 0.4F, 0.4F, 10);
    public static final Supplier<EntityType<Catfish>> CATFISH = NaturalistRegistries.registerEntityType("catfish", Catfish::new, MobCategory.WATER_AMBIENT, 0.7f, 0.4f, 4);
    public static final Supplier<EntityType<Snake>> CORAL_SNAKE = NaturalistRegistries.registerEntityType("coral_snake", Snake::new, MobCategory.CREATURE, 0.6F, 0.7F, 8);
    public static final Supplier<EntityType<Deer>> DEER = NaturalistRegistries.registerEntityType("deer", Deer::new, MobCategory.CREATURE, 1.3F, 1.6F, 10);
    public static final Supplier<EntityType<Dragonfly>> DRAGONFLY = NaturalistRegistries.registerEntityType("dragonfly", Dragonfly::new, MobCategory.AMBIENT, 0.9F, 0.7F, 8);
    public static final Supplier<EntityType<Duck>> DUCK = NaturalistRegistries.registerEntityType("duck", Duck::new, MobCategory.CREATURE, 0.6F, 1.0F, 10);
    public static final Supplier<EntityType<ThrownDuckEgg>> DUCK_EGG = NaturalistRegistries.registerEntityType("duck_egg", ThrownDuckEgg::new, MobCategory.MISC, 0.25F, 0.25F, 16);
    public static final Supplier<EntityType<Elephant>> ELEPHANT = NaturalistRegistries.registerEntityType("elephant", Elephant::new, MobCategory.CREATURE, 2.5F, 3.5F, 10);
    public static final Supplier<EntityType<Firefly>> FIREFLY = NaturalistRegistries.registerEntityType("firefly", Firefly::new, MobCategory.AMBIENT, 0.7F, 0.6F, 8);
    public static final Supplier<EntityType<Bird>> FINCH = NaturalistRegistries.registerEntityType("finch", Bird::new, MobCategory.CREATURE, 0.5F, 0.6F, 0.6F * 0.6F, 8);
    public static final Supplier<EntityType<Giraffe>> GIRAFFE = NaturalistRegistries.registerEntityType("giraffe", Giraffe::new, MobCategory.CREATURE, 1.9f, 5.4f, 10);
    public static final Supplier<EntityType<Hippo>> HIPPO = NaturalistRegistries.registerEntityType("hippo", Hippo::new, MobCategory.CREATURE, 1.8F, 1.8F, 10);
    public static final Supplier<EntityType<Lion>> LION = NaturalistRegistries.registerEntityType("lion", Lion::new, MobCategory.CREATURE, 1.5F, 1.8F, 10);
    public static final Supplier<EntityType<Lizard>> LIZARD = NaturalistRegistries.registerEntityType("lizard", Lizard::new, MobCategory.CREATURE, 0.8F, 0.5F, 10);
    public static final Supplier<EntityType<LizardTail>> LIZARD_TAIL = NaturalistRegistries.registerEntityType("lizard_tail", LizardTail::new, MobCategory.CREATURE, 0.7f, 0.5f, 10);
//    public static final Supplier<EntityType<Ostrich>> OSTRICH = NaturalistRegistries.registerEntityType("ostrich", Ostrich::new, MobCategory.CREATURE, 1.4F, 2.1F, 10);

    // Moose
    public static final Supplier<EntityType<Moose>> MOOSE = NaturalistRegistries.registerEntityType("moose", Moose::new, MobCategory.CREATURE, 1.7F, 2.0F, 10);

    public static final Supplier<EntityType<Snake>> RATTLESNAKE = NaturalistRegistries.registerEntityType("rattlesnake", Snake::new, MobCategory.CREATURE, 0.6F, 0.7F, 8);
    public static final Supplier<EntityType<Rhino>> RHINO = NaturalistRegistries.registerEntityType("rhino", Rhino::new, MobCategory.CREATURE, 2.5F, 3.0F, 10);
    public static final Supplier<EntityType<Bird>> ROBIN = NaturalistRegistries.registerEntityType("robin", Bird::new, MobCategory.CREATURE, 0.5F, 0.6F, 0.6F * 0.6F, 8);
    public static final Supplier<EntityType<Snail>> SNAIL = NaturalistRegistries.registerEntityType("snail", Snail::new, MobCategory.CREATURE, 0.7F, 0.7F, 0.3F, 10);
    public static final Supplier<EntityType<Snake>> SNAKE = NaturalistRegistries.registerEntityType("snake", Snake::new, MobCategory.CREATURE, 0.6F, 0.7F, 8);
    public static final Supplier<EntityType<Bird>> SPARROW = NaturalistRegistries.registerEntityType("sparrow", Bird::new, MobCategory.CREATURE, 0.5F, 0.6F, 0.6F * 0.6F, 8);
    public static final Supplier<EntityType<Tortoise>> TORTOISE = NaturalistRegistries.registerEntityType("tortoise", Tortoise::new, MobCategory.CREATURE, 1.2F, 0.875F, 10);
    public static final Supplier<EntityType<Vulture>> VULTURE = NaturalistRegistries.registerEntityType("vulture", Vulture::new, MobCategory.CREATURE, 0.9f, 0.5f, 10);
    public static final Supplier<EntityType<Zebra>> ZEBRA = NaturalistRegistries.registerEntityType("zebra", Zebra::new, MobCategory.CREATURE, 1.3964844F, 1.5F, 10);

    public static void init() {
    }
}
