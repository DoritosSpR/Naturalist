package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Bear;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.item.Items;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

@OnlyIn(Dist.CLIENT)
public class BearModel extends GeoModel<Bear> {
    @Override
    public @NotNull ResourceLocation getModelResource(Bear bear) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/bear.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(@NotNull Bear bear) {
        if (bear.isAngry()) {
            return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/bear/black_bear_angry.png");
        } else if (bear.isSleeping()) {
            return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/bear/bear.png");
        } else if (bear.isEating()) {
            if (bear.getMainHandItem().is(Items.SWEET_BERRIES)) {
                return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/bear/black_bear_berries.png");
            } else if (bear.getMainHandItem().is(Items.HONEYCOMB)) {
                return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/bear/black_bear_honey.png");
            }
            return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/bear/bear.png");
        }

        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/bear/bear.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Bear bear) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/bear.animation.json");
    }

    @Override
    public void setCustomAnimations(Bear entity, long instanceId, AnimationState<Bear> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");

        if (skull != null) {
            if (entity.isBaby()) {
                skull.setScaleX(1.8F);
                skull.setScaleY(1.8F);
                skull.setScaleZ(1.8F);
            } else {
                skull.setScaleX(1.0F);
                skull.setScaleY(1.0F);
                skull.setScaleZ(1.0F);
            }
            if (!entity.isSleeping() && !entity.isEating() && !entity.isSitting()) {
                assert extraDataOfType != null;
                skull.setRotX(extraDataOfType.headPitch() * Mth.DEG_TO_RAD);
                skull.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
            }
        }
    }
}
