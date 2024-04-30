
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZeldaSwordSkillRebornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.DEKU_SHIELD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.HYLIAN_SHIELD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.FAIRY_SLINGSHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.BOMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.BOOMERANG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.BOWOF_HERO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.BOW_OF_HERO_DRAWING_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.BOW_OF_HERO_DRAWIN_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.BOW_OF_HEROO_DRAWING_3.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.LONGSHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZeldaSwordSkillRebornModEntities.MIRROR_SHIELD.get(), ThrownItemRenderer::new);
	}
}
