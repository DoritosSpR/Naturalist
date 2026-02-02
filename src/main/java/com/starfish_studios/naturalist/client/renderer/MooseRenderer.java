package com.starfish_studios.naturalist.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.starfish_studios.naturalist.client.model.MooseModel;
import com.starfish_studios.naturalist.entity.Moose;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

@OnlyIn(Dist.CLIENT)
public class MooseRenderer extends GeoEntityRenderer<Moose> {
    public MooseRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MooseModel());
        this.shadowRadius = 0.6F;
    }

    @Override
    public float getMotionAnimThreshold(Moose animatable) {
        return 0.000001f;
    }

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public void render(@NotNull Moose entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5F, 0.5F, 0.5F);
        } else {
            poseStack.scale(1.0F, 1.0F, 1.0F);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    public void renderRecursively(PoseStack stack, Moose entity, GeoBone bone, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight,
                                  int packedOverlay, int packedARGB) {
        super.renderRecursively(stack, entity, bone, renderType, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, packedARGB);
    }
}
