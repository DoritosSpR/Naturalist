package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Elephant;
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
public class ElephantModel extends GeoModel<Elephant> {
    @Override
    public ResourceLocation getModelResource(Elephant elephant) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/elephant.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Elephant elephant) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, /*elephant.isDirty() ? "textures/entity/elephant_dirt.png" :*/ "textures/entity/elephant/elephant.png");
    }

    @Override
    public @NotNull ResourceLocation getAnimationResource(Elephant elephant) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/elephant.animation.json");
    }

    @Override
    public void setCustomAnimations(Elephant entity, long instanceId, AnimationState<Elephant> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");
        GeoBone bigTusks = this.getAnimationProcessor().getBone("tusks");
        GeoBone smallTusks = this.getAnimationProcessor().getBone("baby_tusks");
        GeoBone babyTrunk = this.getAnimationProcessor().getBone("trunk4");
        GeoBone leftEar = this.getAnimationProcessor().getBone("left_ear");
        GeoBone rightEar = this.getAnimationProcessor().getBone("right_ear");

        if (skull != null) {
            if (entity.isBaby()) {
                skull.setScaleX(1.3F);
                skull.setScaleY(1.3F);
                skull.setScaleZ(1.3F);
                if (leftEar != null) {
                    leftEar.setScaleX(1.2F);
                    leftEar.setScaleY(1.2F);
                    leftEar.setScaleZ(1.2F);
                }
                if (rightEar != null) {
                    rightEar.setScaleX(1.2F);
                    rightEar.setScaleY(1.2F);
                    rightEar.setScaleZ(1.2F);
                }
                if (smallTusks != null) smallTusks.setHidden(false);
                if (bigTusks != null) bigTusks.setHidden(true);
                if (babyTrunk != null) babyTrunk.setHidden(true);
            } else {
                skull.setScaleX(1.0F);
                skull.setScaleY(1.0F);
                skull.setScaleZ(1.0F);
                if (leftEar != null) {
                    leftEar.setScaleX(1.0F);
                    leftEar.setScaleY(1.0F);
                    leftEar.setScaleZ(1.0F);
                }
                if (rightEar != null) {
                    rightEar.setScaleX(1.0F);
                    rightEar.setScaleY(1.0F);
                    rightEar.setScaleZ(1.0F);
                }
                if (smallTusks != null) smallTusks.setHidden(true);
                if (bigTusks != null) bigTusks.setHidden(false);
                if (babyTrunk != null) babyTrunk.setHidden(false);
            }
            assert extraDataOfType != null;
            skull.setRotX(extraDataOfType.headPitch() * Mth.DEG_TO_RAD);
            skull.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
