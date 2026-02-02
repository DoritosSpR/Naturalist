package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Alligator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

@OnlyIn(Dist.CLIENT)
public class AlligatorModel extends GeoModel<Alligator> {

    @Override
    public ResourceLocation getModelResource(Alligator alligator) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/alligator.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Alligator alligator) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/alligator/alligator.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Alligator alligator) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/alligator.animation.json");
    }

    @Override
    public void setCustomAnimations(Alligator entity, long instanceId, @Nullable AnimationState<Alligator> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;

        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");
        this.getAnimationProcessor().getBone("tail");

        if (skull != null) {
            if (entity.isBaby()) {
                skull.setScaleX(1.5F);
                skull.setScaleY(1.5F);
                skull.setScaleZ(1.5F);
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
