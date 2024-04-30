
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RedRupeeItem extends Item {
	public RedRupeeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
