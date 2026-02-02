package com.starfish_studios.naturalist.advancements;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.advancements.criterion.CaughtEntityTrigger;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.resources.ResourceLocation;

public class NaturalistCriteriaTriggers {
    public static final CaughtEntityTrigger CAUGHT_ENTITY = new CaughtEntityTrigger();

    public static void init() {
        CriteriaTriggers.register(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "caught_entity").toString(), CAUGHT_ENTITY);
    }
}
