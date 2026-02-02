package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Rhino;
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
public class RhinoModel extends GeoModel<Rhino> {
    @Override
    public ResourceLocation getModelResource(Rhino rhino) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/rhino.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Rhino rhino) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/rhino.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Rhino rhino) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/rhino.animation.json");
    }

    @Override
    public void setCustomAnimations(@NotNull Rhino entity, long instanceId, AnimationState<Rhino> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");
        GeoBone bigHorn = this.getAnimationProcessor().getBone("big_horn");
        GeoBone smallHorn = this.getAnimationProcessor().getBone("small_horn");
        GeoBone babyHorn = this.getAnimationProcessor().getBone("baby_horn");
        GeoBone leftEar = this.getAnimationProcessor().getBone("left_ear");
        GeoBone rightEar = this.getAnimationProcessor().getBone("right_ear");

        if (skull != null) {
            if (entity.isBaby()) {
                skull.setScaleX(1.4F);
                skull.setScaleY(1.4F);
                skull.setScaleZ(1.4F);
                if (leftEar != null) {
                    leftEar.setScaleX(1.1F);
                    leftEar.setScaleY(1.1F);
                    leftEar.setScaleZ(1.1F);
                }
                if (rightEar != null) {
                    rightEar.setScaleX(1.1F);
                    rightEar.setScaleY(1.1F);
                    rightEar.setScaleZ(1.1F);
                }
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
            }
            if (!entity.isSprinting()) {
                assert extraDataOfType != null;
                skull.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
            }
        }

        if (bigHorn != null) bigHorn.setHidden(entity.isBaby());
        if (smallHorn != null) smallHorn.setHidden(entity.isBaby());
        if (babyHorn != null) babyHorn.setHidden(!entity.isBaby());
    }
}
