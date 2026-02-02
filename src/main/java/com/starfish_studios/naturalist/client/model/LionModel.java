package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Lion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

@OnlyIn(Dist.CLIENT)
public class LionModel extends GeoModel<Lion> {
    @Override
    public @NotNull ResourceLocation getModelResource(Lion entity) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/lion.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Lion entity) {
        return (entity.isSleeping() && entity.hasMane()) && !entity.isBaby() ? ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/lion/lion_sleep.png") :
                (!entity.hasMane() && entity.isSleeping() || entity.isBaby() && entity.isSleeping()) ? ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/lion/lioness_sleep.png") :
                        (!entity.hasMane() && !entity.isAggressive() || entity.isBaby()) ? ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/lion/lioness.png") :
                                (entity.isAggressive()) && !entity.isBaby() && entity.hasMane() ? ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/lion/lion_angry.png") :
                                        (!entity.hasMane() && entity.isAggressive()) || entity.isBaby() && entity.isAggressive() ? ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/lion/lioness_angry.png") :
                                                ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/lion/lion.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Lion entity) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/lion.animation.json");
    }

    @Override
    public void setCustomAnimations(Lion entity, long instanceId, @Nullable AnimationState<Lion> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");
        GeoBone mane = this.getAnimationProcessor().getBone("mane");

        if (skull != null) {
            if (entity.isBaby()) {
                skull.setScaleX(1.4F);
                skull.setScaleY(1.4F);
                skull.setScaleZ(1.4F);
            } else {
                skull.setScaleX(1.0F);
                skull.setScaleY(1.0F);
                skull.setScaleZ(1.0F);
            }
            if (!entity.isSleeping()) {
                assert extraDataOfType != null;
                skull.setRotX(extraDataOfType.headPitch() * Mth.DEG_TO_RAD);
                skull.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
            }
        }
        if (mane != null) mane.setHidden(!entity.hasMane() || entity.isBaby());
    }
}
