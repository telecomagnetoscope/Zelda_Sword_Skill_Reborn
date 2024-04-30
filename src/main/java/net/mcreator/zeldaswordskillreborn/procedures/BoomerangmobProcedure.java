package net.mcreator.zeldaswordskillreborn.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModItems;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

public class BoomerangmobProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ZeldaSwordSkillRebornMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ZeldaSwordSkillRebornModItems.BOOMERANG.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		});
	}
}
