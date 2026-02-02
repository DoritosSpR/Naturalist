package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Snake;
import com.starfish_studios.naturalist.registry.NaturalistEntityTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

@OnlyIn(Dist.CLIENT)
public class SnakeModel extends GeoModel<Snake> {
    @Override
    public ResourceLocation getModelResource(Snake snake) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/snake.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(@NotNull Snake snake) {
        if (snake.getType().equals(NaturalistEntityTypes.CORAL_SNAKE.get())) {
            return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/snake/coral_snake.png");
        } else if (snake.getType().equals(NaturalistEntityTypes.RATTLESNAKE.get())) {
            return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/snake/rattlesnake.png");
        } else {
            return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/snake/snake.png");
        }
    }

    @Override
    public ResourceLocation getAnimationResource(Snake snake) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/snake.animation.json");
    }

    @Override
    public void setCustomAnimations(Snake entity, long instanceId, AnimationState<Snake> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");
        GeoBone tail2 = this.getAnimationProcessor().getBone("tail2");
        GeoBone tail4 = this.getAnimationProcessor().getBone("tail4");

        if (skull != null && !entity.isSleeping()) {
            assert extraDataOfType != null;
            skull.setRotX(extraDataOfType.headPitch() * Mth.DEG_TO_RAD);
            skull.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
        }
        if (tail2 != null && !entity.getMainHandItem().isEmpty()) {
            tail2.setScaleX(1.5F);
            tail2.setScaleY(1.5F);
        }
        if (tail4 != null) {
            tail4.setHidden(!entity.getType().equals(NaturalistEntityTypes.RATTLESNAKE.get()));
        }
    }
}
