package com.starfish_studios.naturalist.client.model;

import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.entity.Butterfly;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;

@OnlyIn(Dist.CLIENT)
public class ButterflyModel extends GeoModel<Butterfly> {
    @Override
    public @NotNull ResourceLocation getModelResource(Butterfly butterfly) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "geo/entity/butterfly.geo.json");
    }

    @Override
    public @NotNull ResourceLocation getTextureResource(Butterfly butterfly) {
        String name = butterfly.getVariant().getName();
        return switch (name) {
            case "monarch" -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/monarch.png");
            case "clouded_yellow" -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/clouded_yellow.png");
            case "blue_morpho" -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/blue_morpho.png");
            case "green_swallowtail" -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/green_swallowtail.png");
            case "jade_green_swallowtail" -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/jade_green_swallowtail.png");
            case "purple_emperor" -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/purple_emperor.png");
            case "red_admiral" -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/red_admiral.png");
            default -> ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/butterfly/monarch.png");
        };
    }

    @Override
    public ResourceLocation getAnimationResource(Butterfly butterfly) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "animations/butterfly.animation.json");
    }

    @Override
    public void setCustomAnimations(Butterfly animatable, long instanceId, @Nullable AnimationState<Butterfly> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
        if (animationState == null) return;

        GeoBone root = this.getAnimationProcessor().getBone("root");
        if (root != null) {
            Vec3 motion = animatable.getDeltaMovement();
            double vz = motion.y * 2.0D;
            double hz = motion.horizontalDistance();
            float tilt = (float) Mth.clamp(Math.atan2(vz, hz), -Mth.DEG_TO_RAD * 45.0F, Mth.DEG_TO_RAD * 45.0F);
            float speed = (float) Math.sqrt(hz * hz + vz * vz);
            float factor = Mth.clamp(speed / 0.2F, 0.0F, 1.0F);
            factor *= factor;
            float base = root.getRotX();
            float target = base + tilt * factor;
            root.setRotX(Mth.lerp(0.25F, base, target));
        }
    }
}
