
package net.mcreator.zeldaswordskillreborn.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.zeldaswordskillreborn.procedures.RedPotionPlayerFinishesUsingItemProcedure;
import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModTabs;
import net.mcreator.zeldaswordskillreborn.init.ZeldaSwordSkillRebornModItems;

public class RedPotionItem extends Item {
	public RedPotionItem() {
		super(new Item.Properties().tab(ZeldaSwordSkillRebornModTabs.TAB_ZSS_ITEM).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(1f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(ZeldaSwordSkillRebornModItems.EMPTY_BOTTLE.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RedPotionPlayerFinishesUsingItemProcedure.execute(world, x, y, z);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
