package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Giraffe;
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
public class GiraffeModel extends GeoModel<Giraffe> {
    @Override
    public ResourceLocation getModelResource(Giraffe giraffe) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/giraffe.geo.json");
    }

    @Override
    public @NotNull ResourceLocation getTextureResource(Giraffe giraffe) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/giraffe/giraffe.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Giraffe giraffe) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/giraffe.animation.json");
    }

    @Override
    public void setCustomAnimations(@NotNull Giraffe entity, long instanceId, AnimationState<Giraffe> animationState) {
        super.setCustomAnimations(entity, instanceId, animationState);

        if (animationState == null) return;


        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        GeoBone skull = this.getAnimationProcessor().getBone("skull");

        if (skull != null) {
            if (entity.isBaby()) {
                skull.setScaleX(1.3F);
                skull.setScaleY(1.3F);
                skull.setScaleZ(1.3F);
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
