package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Boar;
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
public class BoarModel extends GeoModel<Boar> {
    @Override
    public ResourceLocation getModelResource(Boar boar) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/boar.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Boar boar) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/boar.png");
    }

    @Override
    public @NotNull ResourceLocation getAnimationResource(Boar boar) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/boar.animation.json");
    }

    @Override
    public void setCustomAnimations(Boar entity, long instanceId, AnimationState<Boar> animationState) {
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
            skull.setRotZ(extraDataOfType.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
