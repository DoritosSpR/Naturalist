package com.starfish_studios.naturalist.registry;

import com.starfish_studios.naturalist.recipe.BugNetInteractionRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public class NaturalistRecipes {

    public static final RecipeType<BugNetInteractionRecipe> BUG_NET = new RecipeType<>() {
        @Override
        public String toString() {
            return "naturalist:net";
        }
    };

    public static final RecipeSerializer<?> BUG_NET_SERIALIZER = new BugNetInteractionRecipe.Serializer();

    public static void register() {
        NaturalistRegistries.registerRecipes("net", () -> BUG_NET, () -> BUG_NET_SERIALIZER);
    }
}