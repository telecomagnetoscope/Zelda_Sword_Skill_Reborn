
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModTabs;

public class PurpleRupeeItem extends Item {
	public PurpleRupeeItem() {
		super(new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_ITEM).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
