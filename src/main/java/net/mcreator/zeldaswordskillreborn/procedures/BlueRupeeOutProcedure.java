package net.mcreator.zeldaswordskillreborn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.zeldaswordskillreborn.network.ZeldaSwordSkillRebornModVariables;
import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModItems;

import java.util.function.Supplier;
import java.util.Map;

public class BlueRupeeOutProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee >= 5) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ZeldaSwordSkillRebornModItems.BLUE_RUPEE.get());
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee = ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee - 5;
			ZeldaSwordSkillRebornModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
