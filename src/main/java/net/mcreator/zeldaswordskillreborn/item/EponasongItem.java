
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModTabs;

public class EponasongItem extends Item {
	public EponasongItem() {
		super(new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_MUSIC).stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
