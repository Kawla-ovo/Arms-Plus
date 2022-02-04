
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sword.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SwordModTabs {
	public static CreativeModeTab TAB_SWORDPLUS;

	public static void load() {
		TAB_SWORDPLUS = new CreativeModeTab("tabswordplus") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.NETHER_STAR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
