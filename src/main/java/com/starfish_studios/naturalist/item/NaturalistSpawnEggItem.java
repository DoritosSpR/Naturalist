package com.starfish_studios.naturalist.item;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import java.util.function.Supplier;

public class NaturalistSpawnEggItem extends DeferredSpawnEggItem {

    public NaturalistSpawnEggItem(Supplier<? extends EntityType<? extends Mob>> entityType, int backgroundColor, int highlightColor, Item.Properties properties) {
        super(entityType, backgroundColor, highlightColor, properties);
    }

    @Override
    public int getColor(int tintIndex) {
        return 0xFFFFFF;
    }
}
