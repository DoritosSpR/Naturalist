package com.starfish_studios.naturalist.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.starfish_studios.naturalist.Naturalist;
import com.starfish_studios.naturalist.client.model.ZebraModel;
import com.starfish_studios.naturalist.entity.Zebra;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.AbstractHorseRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class ZebraRenderer extends AbstractHorseRenderer<Zebra, ZebraModel> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "zebra"), "main");

    public ZebraRenderer(EntityRendererProvider.@NotNull Context context) {
        super(context, new ZebraModel(context.bakeLayer(LAYER_LOCATION)), 1.1F);
    }

//    @Override
//    public float getMotionAnimThreshold(Zebra animatable) {
//        return 0.000001f;
//    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Zebra entity) {
        return ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "textures/entity/zebra.png");
    }

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public void render(@NotNull Zebra entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        poseStack.scale(0.8F, 0.8F, 0.8F);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
