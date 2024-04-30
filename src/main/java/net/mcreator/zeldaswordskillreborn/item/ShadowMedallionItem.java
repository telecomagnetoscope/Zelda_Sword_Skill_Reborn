
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModTabs;

public class ShadowMedallionItem extends Item {
	public ShadowMedallionItem() {
		super(new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_TRESORS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
