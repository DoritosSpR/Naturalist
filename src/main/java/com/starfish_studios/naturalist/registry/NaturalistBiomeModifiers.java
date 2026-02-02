package com.starfish_studios.naturalist.registry;

import com.mojang.serialization.MapCodec;
import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.world.AddAnimalsBiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class NaturalistBiomeModifiers {

    public static DeferredRegister<MapCodec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, Naturalist.MOD_ID);

    public static Supplier<MapCodec<AddAnimalsBiomeModifier>> ADD_ANIMALS_CODEC = BIOME_MODIFIER_SERIALIZERS.register("add_animals", () -> MapCodec.unit(AddAnimalsBiomeModifier::new));
}
