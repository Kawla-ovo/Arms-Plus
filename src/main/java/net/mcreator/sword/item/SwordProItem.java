
package net.mcreator.sword.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.sword.procedures.SwordProDangShiTiBeiGongJuJiZhongShiProcedure;
import net.mcreator.sword.init.SwordModTabs;
import net.mcreator.sword.init.SwordModItems;

public class SwordProItem extends SwordItem {
	public SwordProItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SwordModItems.EMERALD_SWORD));
			}
		}, 3, -2.7999999999999998f, new Item.Properties().tab(SwordModTabs.TAB_SWORDPLUS));
		setRegistryName("sword_pro");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		SwordProDangShiTiBeiGongJuJiZhongShiProcedure.execute(world, x, y, z, entity);
		return retval;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
