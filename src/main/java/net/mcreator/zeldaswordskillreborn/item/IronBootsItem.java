
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zeldaswordskillreborn.procedures.IronbootsprocedureProcedure;
import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModTabs;

public abstract class IronBootsItem extends ArmorItem {
	public IronBootsItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "iron_boots";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Boots extends IronBootsItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_EQUIPMENT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "zelda_sword_skill_reborn:textures/models/armor/boots_rubber__-_copie_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			IronbootsprocedureProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}
}
