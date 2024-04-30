package net.mcreator.zeldaswordskillreborn.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.zeldaswordskillreborn.world.inventory.WalletGUIMenu;
import net.mcreator.zeldaswordskillreborn.network.WalletGUIButtonMessage;
import net.mcreator.zeldaswordskillreborn.ZeldaSwordSkillRebornMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WalletGUIScreen extends AbstractContainerScreen<WalletGUIMenu> {
	private final static HashMap<String, Object> guistate = WalletGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1_rupee;
	Button button_5_rupee;
	Button button_5_rupee1;
	Button button_5_rupee2;
	Button button_5_rupee3;
	Button button_5_rupee4;

	public WalletGUIScreen(WalletGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 205;
		this.imageHeight = 178;
	}

	private static final ResourceLocation texture = new ResourceLocation("zelda_sword_skill_reborn:textures/screens/wallet_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.zelda_sword_skill_reborn.wallet_gui.label_empty"), 91, 63, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_1_rupee = new Button(this.leftPos + 5, this.topPos + 4, 61, 20, Component.translatable("gui.zelda_sword_skill_reborn.wallet_gui.button_1_rupee"), e -> {
			if (true) {
				ZeldaSwordSkillRebornMod.PACKET_HANDLER.sendToServer(new WalletGUIButtonMessage(0, x, y, z));
				WalletGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_1_rupee", button_1_rupee);
		this.addRenderableWidget(button_1_rupee);
		button_5_rupee = new Button(this.leftPos + 71, this.topPos + 4, 61, 20, Component.translatable("gui.zelda_sword_skill_reborn.wallet_gui.button_5_rupee"), e -> {
			if (true) {
				ZeldaSwordSkillRebornMod.PACKET_HANDLER.sendToServer(new WalletGUIButtonMessage(1, x, y, z));
				WalletGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_5_rupee", button_5_rupee);
		this.addRenderableWidget(button_5_rupee);
		button_5_rupee1 = new Button(this.leftPos + 138, this.topPos + 4, 61, 20, Component.translatable("gui.zelda_sword_skill_reborn.wallet_gui.button_5_rupee1"), e -> {
			if (true) {
				ZeldaSwordSkillRebornMod.PACKET_HANDLER.sendToServer(new WalletGUIButtonMessage(2, x, y, z));
				WalletGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_5_rupee1", button_5_rupee1);
		this.addRenderableWidget(button_5_rupee1);
		button_5_rupee2 = new Button(this.leftPos + 5, this.topPos + 29, 61, 20, Component.translatable("gui.zelda_sword_skill_reborn.wallet_gui.button_5_rupee2"), e -> {
			if (true) {
				ZeldaSwordSkillRebornMod.PACKET_HANDLER.sendToServer(new WalletGUIButtonMessage(3, x, y, z));
				WalletGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_5_rupee2", button_5_rupee2);
		this.addRenderableWidget(button_5_rupee2);
		button_5_rupee3 = new Button(this.leftPos + 71, this.topPos + 29, 61, 20, Component.translatable("gui.zelda_sword_skill_reborn.wallet_gui.button_5_rupee3"), e -> {
			if (true) {
				ZeldaSwordSkillRebornMod.PACKET_HANDLER.sendToServer(new WalletGUIButtonMessage(4, x, y, z));
				WalletGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_5_rupee3", button_5_rupee3);
		this.addRenderableWidget(button_5_rupee3);
		button_5_rupee4 = new Button(this.leftPos + 138, this.topPos + 29, 61, 20, Component.translatable("gui.zelda_sword_skill_reborn.wallet_gui.button_5_rupee4"), e -> {
			if (true) {
				ZeldaSwordSkillRebornMod.PACKET_HANDLER.sendToServer(new WalletGUIButtonMessage(5, x, y, z));
				WalletGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_5_rupee4", button_5_rupee4);
		this.addRenderableWidget(button_5_rupee4);
	}
}
