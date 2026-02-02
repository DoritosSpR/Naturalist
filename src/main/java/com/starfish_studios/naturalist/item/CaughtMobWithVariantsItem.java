package com.starfish_studios.naturalist.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

import java.util.function.Supplier;

public class CaughtMobWithVariantsItem extends CaughtMobItem {

    public CaughtMobWithVariantsItem(Supplier<? extends EntityType<?>> entitySupplier, Supplier<? extends Fluid> fluidSupplier, Supplier<? extends SoundEvent> soundSupplier, Item.Properties properties) {
        super(entitySupplier, fluidSupplier, soundSupplier, properties);
    }
}
