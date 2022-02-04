
package net.mcreator.sword.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.sword.procedures.FireSwordDangShiTiBeiGongJuJiZhongShiProcedure;
import net.mcreator.sword.init.SwordModTabs;

public class FireSwordItem extends SwordItem {
	public FireSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.2999999999999999f, new Item.Properties().tab(SwordModTabs.TAB_SWORDPLUS));
		setRegistryName("fire_sword");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		FireSwordDangShiTiBeiGongJuJiZhongShiProcedure.execute(entity);
		return retval;
	}
}
