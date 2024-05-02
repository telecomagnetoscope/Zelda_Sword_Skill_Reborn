
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.zeldaswordskillreborn.client.gui.WalletGUIScreen;
import net.mcreator.zeldaswordskillreborn.client.gui.OcarinaGuiScreen;
import net.mcreator.zeldaswordskillreborn.client.gui.ItemGuiScreen;
import net.mcreator.zeldaswordskillreborn.client.gui.GearMenuGUIScreen;
import net.mcreator.zeldaswordskillreborn.client.gui.GateoftimeGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZeldaSwordSkillRebornModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ZeldaSwordSkillRebornModMenus.GEAR_MENU_GUI.get(), GearMenuGUIScreen::new);
			MenuScreens.register(ZeldaSwordSkillRebornModMenus.ITEM_GUI.get(), ItemGuiScreen::new);
			MenuScreens.register(ZeldaSwordSkillRebornModMenus.WALLET_GUI.get(), WalletGUIScreen::new);
			MenuScreens.register(ZeldaSwordSkillRebornModMenus.OCARINA_GUI.get(), OcarinaGuiScreen::new);
			MenuScreens.register(ZeldaSwordSkillRebornModMenus.GATEOFTIME_GUI.get(), GateoftimeGUIScreen::new);
		});
	}
}
