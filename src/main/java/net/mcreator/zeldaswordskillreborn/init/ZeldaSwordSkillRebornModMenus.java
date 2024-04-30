
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.zeldaswordskillreborn.world.inventory.QuestMenuMenu;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

public class ZeldaSwordSkillRebornModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ZeldaSwordSkillRebornMod.MODID);
	public static final RegistryObject<MenuType<QuestMenuMenu>> QUEST_MENU = REGISTRY.register("quest_menu", () -> IForgeMenuType.create(QuestMenuMenu::new));
}
