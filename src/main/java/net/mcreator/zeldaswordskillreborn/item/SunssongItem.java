
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.zeldaswordskillreborn.procedures.SunssongRightclickedProcedure;
import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModTabs;

public class SunssongItem extends Item {
	public SunssongItem() {
		super(new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_MUSIC).stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SunssongRightclickedProcedure.execute(world, x, y, z);
		return ar;
	}
}
