package net.mcreator.zeldaswordskillreborn.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModItems;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

public class HoverbootsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (false) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.07), (entity.getDeltaMovement().z())));
			if (entity.getDeltaMovement().y() < -0.25) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.2), (entity.getDeltaMovement().z())));
				ZeldaSwordSkillRebornMod.queueServerWork(80, () -> {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ZeldaSwordSkillRebornModItems.HOVER_BOOTS.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ZeldaSwordSkillRebornModItems.HOVER_BOOTS.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
		}
	}
}
