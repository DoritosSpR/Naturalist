package com.starfish_studios.naturalist;

//import com.starfish_studios.naturalist.client.compat.LambDynamicLightsCompat;
import com.starfish_studios.naturalist.client.model.ZebraModel;
import com.starfish_studios.naturalist.client.renderer.*;
import com.starfish_studios.naturalist.registry.NaturalistEntityTypes;
import com.starfish_studios.naturalist.registry.NaturalistRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import org.jetbrains.annotations.NotNull;

@EventBusSubscriber(modid = Naturalist.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NaturalistClient {

    @SuppressWarnings("deprecation")
    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
//            LambDynamicLightsCompat.registerIfPresent();
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.CHRYSALIS_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.AZURE_FROGLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.AZURE_FROGLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.VERDANT_FROGLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.VERDANT_FROGLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.CRIMSON_FROGLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.CRIMSON_FROGLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(NaturalistRegistry.SNAIL_EGGS.get(), RenderType.cutout());

            EntityRenderers.register(NaturalistEntityTypes.SNAIL.get(), SnailRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.BEAR.get(), BearRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.BUTTERFLY.get(), ButterflyRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.FIREFLY.get(), FireflyRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.SNAKE.get(), SnakeRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.CORAL_SNAKE.get(), SnakeRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.RATTLESNAKE.get(), SnakeRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.DEER.get(), DeerRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.BLUEJAY.get(), BirdRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.CARDINAL.get(), BirdRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.CANARY.get(), BirdRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.ROBIN.get(), BirdRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.FINCH.get(), BirdRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.SPARROW.get(), BirdRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.CATERPILLAR.get(), CaterpillarRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.RHINO.get(), RhinoRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.LION.get(), LionRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.ELEPHANT.get(), ElephantRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.ZEBRA.get(), ZebraRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.GIRAFFE.get(), GiraffeRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.HIPPO.get(), HippoRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.VULTURE.get(), VultureRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.BOAR.get(), BoarRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.DRAGONFLY.get(), DragonflyRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.CATFISH.get(), CatfishRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.ALLIGATOR.get(), AlligatorRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.BASS.get(), BassRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.LIZARD.get(), LizardRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.LIZARD_TAIL.get(), LizardTailRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.MOOSE.get(), MooseRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.TORTOISE.get(), TortoiseRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.DUCK.get(), DuckRenderer::new);
            EntityRenderers.register(NaturalistEntityTypes.DUCK_EGG.get(), ThrownItemRenderer::new);

            ItemProperties.register(NaturalistRegistry.BUTTERFLY.get(), ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "variant"), (stack, world, entity, num) -> {
                if (stack.has(DataComponents.CUSTOM_DATA)) {
                    var customData = stack.get(DataComponents.CUSTOM_DATA);
                    if (customData != null && customData.contains("Variant")) {
                        return (float) customData.copyTag().getInt("Variant") / 5;
                    }
                }
                return 0.2F;
            });

            ItemProperties.register(NaturalistRegistry.SNAIL_BUCKET.get(), ResourceLocation.fromNamespaceAndPath(Naturalist.MOD_ID, "color"), (stack, world, entity, num) -> {
                if (stack.has(DataComponents.CUSTOM_DATA)) {
                    var customData = stack.get(DataComponents.CUSTOM_DATA);
                    if (customData != null && customData.contains("Color")) {
                        return (float) customData.copyTag().getInt("Color") / 15;
                    }
                }
                return 0.8F;
            });
        });
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.@NotNull RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ZebraRenderer.LAYER_LOCATION, ZebraModel::createBodyLayer);
    }
}
