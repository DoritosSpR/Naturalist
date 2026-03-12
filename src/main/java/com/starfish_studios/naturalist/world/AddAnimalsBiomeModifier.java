package com.starfish_studios.naturalist.world;

import com.mojang.serialization.MapCodec;
import com.starfish_studios.naturalist.NaturalistConfig;
import com.starfish_studios.naturalist.registry.NaturalistBiomeModifiers;
import com.starfish_studios.naturalist.registry.NaturalistEntityTypes;
import com.starfish_studios.naturalist.registry.NaturalistTags;
import net.minecraft.core.Holder;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.ModifiableBiomeInfo;
import org.jetbrains.annotations.NotNull;

public class AddAnimalsBiomeModifier implements BiomeModifier {
    @Override
    public void modify(@NotNull Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.@NotNull Builder builder) {
        if (phase.equals(Phase.ADD)) {
            /* ALLIGATOR */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_ALLIGATOR))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_ALLIGATOR, MobCategory.CREATURE, NaturalistEntityTypes.ALLIGATOR.get(), NaturalistConfig.alligatorSpawnWeight, NaturalistConfig.alligatorSpawnMinGroupSize, NaturalistConfig.alligatorSpawnMaxGroupSize);
            /* BASS */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_BASS))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_BASS, MobCategory.WATER_AMBIENT, NaturalistEntityTypes.BASS.get(), NaturalistConfig.bassSpawnWeight, NaturalistConfig.bassSpawnMinGroupSize, NaturalistConfig.bassSpawnMaxGroupSize);
            /* BEAR */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_BEAR))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_BEAR, MobCategory.CREATURE, NaturalistEntityTypes.BEAR.get(), NaturalistConfig.bearSpawnWeight, NaturalistConfig.bearSpawnMinGroupSize, NaturalistConfig.bearSpawnMaxGroupSize);
            /* BLUEJAY */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_BLUEJAY))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_BLUEJAY, MobCategory.CREATURE, NaturalistEntityTypes.BLUEJAY.get(), NaturalistConfig.bluejaySpawnWeight, NaturalistConfig.bluejaySpawnMinGroupSize, NaturalistConfig.bluejaySpawnMaxGroupSize);
            /* BOAR */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_BOAR))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_BOAR, MobCategory.CREATURE, NaturalistEntityTypes.BOAR.get(), NaturalistConfig.boarSpawnWeight, NaturalistConfig.boarSpawnMinGroupSize, NaturalistConfig.boarSpawnMaxGroupSize);
            /* BUTTERFLY */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_BUTTERFLY))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_BUTTERFLY, MobCategory.CREATURE, NaturalistEntityTypes.BUTTERFLY.get(), NaturalistConfig.butterflySpawnWeight, NaturalistConfig.butterflySpawnMinGroupSize, NaturalistConfig.butterflySpawnMaxGroupSize);
            /* CANARY */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_CANARY))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_CANARY, MobCategory.CREATURE, NaturalistEntityTypes.CANARY.get(), NaturalistConfig.canarySpawnWeight, NaturalistConfig.canarySpawnMinGroupSize, NaturalistConfig.canarySpawnMaxGroupSize);
            /* CARDINAL */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_CARDINAL))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_CARDINAL, MobCategory.CREATURE, NaturalistEntityTypes.CARDINAL.get(), NaturalistConfig.cardinalSpawnWeight, NaturalistConfig.cardinalSpawnMinGroupSize, NaturalistConfig.cardinalSpawnMaxGroupSize);
            /* CATFISH */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_CATFISH))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_CATFISH, MobCategory.WATER_AMBIENT, NaturalistEntityTypes.CATFISH.get(), NaturalistConfig.catfishSpawnWeight, NaturalistConfig.catfishSpawnMinGroupSize, NaturalistConfig.catfishSpawnMaxGroupSize);
            /* CORAL_SNAKE */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_CORAL_SNAKE))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_CORAL_SNAKE, MobCategory.CREATURE, NaturalistEntityTypes.CORAL_SNAKE.get(), NaturalistConfig.coralSnakeSpawnWeight, NaturalistConfig.coralSnakeSpawnMinGroupSize, NaturalistConfig.coralSnakeSpawnMaxGroupSize);
            /* DEER */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_DEER))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_DEER, MobCategory.CREATURE, NaturalistEntityTypes.DEER.get(), NaturalistConfig.deerSpawnWeight, NaturalistConfig.deerSpawnMinGroupSize, NaturalistConfig.deerSpawnMaxGroupSize);
            /* DRAGONFLY */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_DRAGONFLY))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_DRAGONFLY, MobCategory.AMBIENT, NaturalistEntityTypes.DRAGONFLY.get(), NaturalistConfig.dragonflySpawnWeight, NaturalistConfig.dragonflySpawnMinGroupSize, NaturalistConfig.dragonflySpawnMaxGroupSize);
            /* DUCK */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_DUCK))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_DUCK, MobCategory.CREATURE, NaturalistEntityTypes.DUCK.get(), NaturalistConfig.duckSpawnWeight, NaturalistConfig.duckSpawnMinGroupSize, NaturalistConfig.duckSpawnMaxGroupSize);
            /* ELEPHANT */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_ELEPHANT))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_ELEPHANT, MobCategory.CREATURE, NaturalistEntityTypes.ELEPHANT.get(), NaturalistConfig.elephantSpawnWeight, NaturalistConfig.elephantSpawnMinGroupSize, NaturalistConfig.elephantSpawnMaxGroupSize);
            /* FINCH */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_FINCH))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_FINCH, MobCategory.CREATURE, NaturalistEntityTypes.FINCH.get(), NaturalistConfig.finchSpawnWeight, NaturalistConfig.finchSpawnMinGroupSize, NaturalistConfig.finchSpawnMaxGroupSize);
            /* FIREFLY */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_FIREFLY))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_FIREFLY, MobCategory.AMBIENT, NaturalistEntityTypes.FIREFLY.get(), NaturalistConfig.fireflySpawnWeight, NaturalistConfig.fireflySpawnMinGroupSize, NaturalistConfig.fireflySpawnMaxGroupSize);
            /* FOREST FOXES */
            addMobSpawn(builder, biome, BiomeTags.IS_FOREST, MobCategory.CREATURE, EntityType.FOX, NaturalistConfig.forestFoxSpawnWeight, NaturalistConfig.forestFoxSpawnMinGroupSize, NaturalistConfig.forestFoxSpawnMaxGroupSize);
            /* FOREST RABBITS */
            addMobSpawn(builder, biome, BiomeTags.IS_FOREST, MobCategory.CREATURE, EntityType.RABBIT, NaturalistConfig.forestRabbitSpawnWeight, NaturalistConfig.forestRabbitSpawnMinGroupSize, NaturalistConfig.forestRabbitSpawnMaxGroupSize);
            /* GIRAFFE */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_GIRAFFE))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_GIRAFFE, MobCategory.CREATURE, NaturalistEntityTypes.GIRAFFE.get(), NaturalistConfig.giraffeSpawnWeight, NaturalistConfig.giraffeSpawnMinGroupSize, NaturalistConfig.giraffeSpawnMaxGroupSize);
            /* HIPPO */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_HIPPO))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_HIPPO, MobCategory.CREATURE, NaturalistEntityTypes.HIPPO.get(), NaturalistConfig.hippoSpawnWeight, NaturalistConfig.hippoSpawnMinGroupSize, NaturalistConfig.hippoSpawnMaxGroupSize);
            /* LION */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_LION))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_LION, MobCategory.CREATURE, NaturalistEntityTypes.LION.get(), NaturalistConfig.lionSpawnWeight, NaturalistConfig.lionSpawnMinGroupSize, NaturalistConfig.lionSpawnMaxGroupSize);
            /* LIZARD */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_LIZARD))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_LIZARD, MobCategory.CREATURE, NaturalistEntityTypes.LIZARD.get(), NaturalistConfig.lizardSpawnWeight, NaturalistConfig.lizardSpawnMinGroupSize, NaturalistConfig.lizardSpawnMaxGroupSize);
            /* RHINO */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_RHINO))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_RHINO, MobCategory.CREATURE, NaturalistEntityTypes.RHINO.get(), NaturalistConfig.rhinoSpawnWeight, NaturalistConfig.rhinoSpawnMinGroupSize, NaturalistConfig.rhinoSpawnMaxGroupSize);
            /* ROBIN */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_ROBIN))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_ROBIN, MobCategory.CREATURE, NaturalistEntityTypes.ROBIN.get(), NaturalistConfig.robinSpawnWeight, NaturalistConfig.robinSpawnMinGroupSize, NaturalistConfig.robinSpawnMaxGroupSize);
            /* SNAIL */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_SNAIL))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_SNAIL, MobCategory.CREATURE, NaturalistEntityTypes.SNAIL.get(), NaturalistConfig.snailSpawnWeight, NaturalistConfig.snailSpawnMinGroupSize, NaturalistConfig.snailSpawnMaxGroupSize);
            /* SNAKE */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_SNAKE))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_SNAKE, MobCategory.CREATURE, NaturalistEntityTypes.SNAKE.get(), NaturalistConfig.snakeSpawnWeight, NaturalistConfig.snakeSpawnMinGroupSize, NaturalistConfig.snakeSpawnMaxGroupSize);
            /* SPARROW */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_SPARROW))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_SPARROW, MobCategory.CREATURE, NaturalistEntityTypes.SPARROW.get(), NaturalistConfig.sparrowSpawnWeight, NaturalistConfig.sparrowSpawnMinGroupSize, NaturalistConfig.sparrowSpawnMaxGroupSize);
            /* TORTOISE */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_TORTOISE))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_TORTOISE, MobCategory.CREATURE, NaturalistEntityTypes.TORTOISE.get(), NaturalistConfig.tortoiseSpawnWeight, NaturalistConfig.tortoiseSpawnMinGroupSize, NaturalistConfig.tortoiseSpawnMaxGroupSize);
            /* VULTURE */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_VULTURE))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_VULTURE, MobCategory.CREATURE, NaturalistEntityTypes.VULTURE.get(), NaturalistConfig.vultureSpawnWeight, NaturalistConfig.vultureSpawnMinGroupSize, NaturalistConfig.vultureSpawnMaxGroupSize);
            /* ZEBRA */
            if (!biome.is(NaturalistTags.Biomes.BLACKLIST_ZEBRA))
                addMobSpawn(builder, biome, NaturalistTags.Biomes.HAS_ZEBRA, MobCategory.CREATURE, NaturalistEntityTypes.ZEBRA.get(), NaturalistConfig.zebraSpawnWeight, NaturalistConfig.zebraSpawnMinGroupSize, NaturalistConfig.zebraSpawnMaxGroupSize);
        }
    }


    void addMobSpawn(ModifiableBiomeInfo.BiomeInfo.Builder builder, Holder<Biome> biome, TagKey<Biome> tag, MobCategory mobCategory, EntityType<?> entityType, int weight, int minGroupSize, int maxGroupSize) {
        if (weight <= 0) {
            builder.getMobSpawnSettings().getSpawner(mobCategory).removeIf(spawnerData -> spawnerData.type == entityType);
            return;
        }
        if (biome.is(tag)) {
            builder.getMobSpawnSettings().addSpawn(mobCategory, new MobSpawnSettings.SpawnerData(entityType, weight, minGroupSize, maxGroupSize));
        }
    }

    @Override
    public @NotNull MapCodec<? extends BiomeModifier> codec() {
        return NaturalistBiomeModifiers.ADD_ANIMALS_CODEC.get();
    }
}
