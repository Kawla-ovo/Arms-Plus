
package net.mcreator.sword.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.sword.init.SwordModTabs;

public class EmeraldSwordItem extends SwordItem {
	public EmeraldSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.EMERALD));
			}
		}, 3, -3f, new Item.Properties().tab(SwordModTabs.TAB_SWORDPLUS));
		setRegistryName("emerald_sword");
	}
}
