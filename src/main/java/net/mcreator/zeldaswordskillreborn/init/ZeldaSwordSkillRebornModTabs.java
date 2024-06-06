
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zeldaswordskillreborn.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ZeldaSwordSkillRebornModTabs {
	public static CreativeModeTab TAB_ZSS_EQUIPMENT;
	public static CreativeModeTab TAB_ZSS_TRESORS;
	public static CreativeModeTab TAB_ZSS_ITEM;
	public static CreativeModeTab TAB_ZSS_MUSIC;
	public static CreativeModeTab TAB_ZSS_BLOCKS;

	public static void load() {
		TAB_ZSS_EQUIPMENT = new CreativeModeTab("tabzss_equipment") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZeldaSwordSkillRebornModItems.MASTER_SWORD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ZSS_TRESORS = new CreativeModeTab("tabzss_tresors") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZeldaSwordSkillRebornModItems.ZORAS_SAPPHIRE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ZSS_ITEM = new CreativeModeTab("tabzss_item") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZeldaSwordSkillRebornModItems.EMPTY_BOTTLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ZSS_MUSIC = new CreativeModeTab("tabzss_music") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZeldaSwordSkillRebornModItems.OCARINA_OF_TIME.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ZSS_BLOCKS = new CreativeModeTab("tabzss_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZeldaSwordSkillRebornModItems.FOREST_MEDALLION.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
