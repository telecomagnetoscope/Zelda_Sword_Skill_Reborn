
package net.mcreator.zeldaswordskillreborn.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.zeldaswordskillreborn.world.inventory.WalletGUIMenu;
import net.mcreator.zeldaswordskillreborn.procedures.YellowRupeeOutProcedure;
import net.mcreator.zeldaswordskillreborn.procedures.SilverRupeeOutProcedure;
import net.mcreator.zeldaswordskillreborn.procedures.RedRupeeOutProcedure;
import net.mcreator.zeldaswordskillreborn.procedures.PurpleRupeeOutProcedure;
import net.mcreator.zeldaswordskillreborn.procedures.GreenRupeeOutProcedure;
import net.mcreator.zeldaswordskillreborn.procedures.BlueRupeeOutProcedure;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WalletGUIButtonMessage {
	private final int buttonID, x, y, z;

	public WalletGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WalletGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WalletGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WalletGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = WalletGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GreenRupeeOutProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			BlueRupeeOutProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			RedRupeeOutProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			PurpleRupeeOutProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			YellowRupeeOutProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			SilverRupeeOutProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ZeldaSwordSkillRebornMod.addNetworkMessage(WalletGUIButtonMessage.class, WalletGUIButtonMessage::buffer, WalletGUIButtonMessage::new, WalletGUIButtonMessage::handler);
	}
}
