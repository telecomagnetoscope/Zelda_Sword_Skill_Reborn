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

public class GreenRupeeInProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem() == ZeldaSwordSkillRebornModItems.GREEN_RUPEE.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee = ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee + 1;
			ZeldaSwordSkillRebornModVariables.MapVariables.get(world).syncData(world);
		} else {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == ZeldaSwordSkillRebornModItems.BLUE_RUPEE.get()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
				ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee = ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee + 5;
				ZeldaSwordSkillRebornModVariables.MapVariables.get(world).syncData(world);
			} else {
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == ZeldaSwordSkillRebornModItems.RED_RUPEE.get()) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee = ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee + 20;
					ZeldaSwordSkillRebornModVariables.MapVariables.get(world).syncData(world);
				} else {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
							.getItem() == ZeldaSwordSkillRebornModItems.PURPLE_RUPEE.get()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).set(ItemStack.EMPTY);
							_player.containerMenu.broadcastChanges();
						}
						ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee = ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee + 50;
						ZeldaSwordSkillRebornModVariables.MapVariables.get(world).syncData(world);
					} else {
						if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == ZeldaSwordSkillRebornModItems.YELLOW_RUPEE.get()) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee = ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee + 100;
							ZeldaSwordSkillRebornModVariables.MapVariables.get(world).syncData(world);
						} else {
							if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
									.getItem() == ZeldaSwordSkillRebornModItems.SILVER_RUPEE.get()) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									((Slot) _slots.get(0)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee = ZeldaSwordSkillRebornModVariables.MapVariables.get(world).Rupee + 500;
								ZeldaSwordSkillRebornModVariables.MapVariables.get(world).syncData(world);
							}
						}
					}
				}
			}
		}
	}
}
