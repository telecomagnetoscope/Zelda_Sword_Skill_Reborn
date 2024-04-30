
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.zeldaswordskillreborn.world.inventory.WalletGUIMenu;
import net.mcreator.zeldaswordskillreborn.world.inventory.OcarinaGuiMenu;
import net.mcreator.zeldaswordskillreborn.world.inventory.ItemGuiMenu;
import net.mcreator.zeldaswordskillreborn.world.inventory.GearMenuGUIMenu;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

public class ZeldaSwordSkillRebornModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ZeldaSwordSkillRebornMod.MODID);
	public static final RegistryObject<MenuType<GearMenuGUIMenu>> GEAR_MENU_GUI = REGISTRY.register("gear_menu_gui", () -> IForgeMenuType.create(GearMenuGUIMenu::new));
	public static final RegistryObject<MenuType<ItemGuiMenu>> ITEM_GUI = REGISTRY.register("item_gui", () -> IForgeMenuType.create(ItemGuiMenu::new));
	public static final RegistryObject<MenuType<WalletGUIMenu>> WALLET_GUI = REGISTRY.register("wallet_gui", () -> IForgeMenuType.create(WalletGUIMenu::new));
	public static final RegistryObject<MenuType<OcarinaGuiMenu>> OCARINA_GUI = REGISTRY.register("ocarina_gui", () -> IForgeMenuType.create(OcarinaGuiMenu::new));
}
