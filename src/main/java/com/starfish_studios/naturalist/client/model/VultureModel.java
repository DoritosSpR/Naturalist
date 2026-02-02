package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Vulture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

@OnlyIn(Dist.CLIENT)
public class VultureModel extends GeoModel<Vulture> {
    @Override
    public ResourceLocation getModelResource(Vulture vulture) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/vulture.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Vulture vulture) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/vulture/vulture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Vulture vulture) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/vulture.animation.json");
    }

    @Override
    public void setCustomAnimations(Vulture entity, long instanceId, AnimationState<Vulture> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");

        if (skull != null) {
            assert extraDataOfType != null;
            skull.setRotX(extraDataOfType.headPitch() * Mth.DEG_TO_RAD);
            skull.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
