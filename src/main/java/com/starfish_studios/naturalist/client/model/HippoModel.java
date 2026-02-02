package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Hippo;
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
public class HippoModel extends GeoModel<Hippo> {
    @Override
    public ResourceLocation getModelResource(Hippo hippo) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/hippo.geo.json");
    }

    @Override
    public @NotNull ResourceLocation getTextureResource(Hippo hippo) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/hippo/hippo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Hippo hippo) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/hippo.animation.json");
    }

    @Override
    public void setCustomAnimations(Hippo entity, long instanceId, @Nullable AnimationState<Hippo> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");

        if (skull != null) {
            if (entity.isBaby()) {
                skull.setScaleX(1.75F);
                skull.setScaleY(1.75F);
                skull.setScaleZ(1.75F);
            } else {
                skull.setScaleX(1.0F);
                skull.setScaleY(1.0F);
                skull.setScaleZ(1.0F);
            }
            assert extraDataOfType != null;
            skull.setRotX(extraDataOfType.headPitch() * Mth.DEG_TO_RAD);
            skull.setRotY(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
