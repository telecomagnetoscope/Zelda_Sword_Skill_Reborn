
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModTabs;

public abstract class KokiriTunicItem extends ArmorItem {
	public KokiriTunicItem(EquipmentSlot slot, Item.Properties properties) {
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
				return "kokiri_tunic";
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

	public static class Helmet extends KokiriTunicItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_EQUIPMENT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "zelda_sword_skill_reborn:textures/models/armor/hero_tunic__layer_1.png";
		}
	}

	public static class Chestplate extends KokiriTunicItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_EQUIPMENT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "zelda_sword_skill_reborn:textures/models/armor/hero_tunic__layer_1.png";
		}
	}

	public static class Leggings extends KokiriTunicItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_EQUIPMENT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "zelda_sword_skill_reborn:textures/models/armor/hero_tunic__layer_2.png";
		}
	}

	public static class Boots extends KokiriTunicItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_EQUIPMENT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "zelda_sword_skill_reborn:textures/models/armor/hero_tunic__layer_1.png";
		}
	}
}
