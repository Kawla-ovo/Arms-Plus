
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sword.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.sword.item.SwordProItem;
import net.mcreator.sword.item.SlowStaffItem;
import net.mcreator.sword.item.MachetePlusItem;
import net.mcreator.sword.item.LavaSwordItem;
import net.mcreator.sword.item.IceSwordItem;
import net.mcreator.sword.item.FireSwordItem;
import net.mcreator.sword.item.ExplodeStaffItem;
import net.mcreator.sword.item.EmeraldSwordItem;
import net.mcreator.sword.item.EmeraldKnifeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SwordModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item EMERALD_SWORD = register(new EmeraldSwordItem());
	public static final Item EMERALD_KNIFE = register(new EmeraldKnifeItem());
	public static final Item SWORD_PRO = register(new SwordProItem());
	public static final Item FIRE_SWORD = register(new FireSwordItem());
	public static final Item LAVA_SWORD = register(new LavaSwordItem());
	public static final Item EXPLODE_STAFF = register(new ExplodeStaffItem());
	public static final Item ICE_SWORD = register(new IceSwordItem());
	public static final Item SLOW_STAFF = register(new SlowStaffItem());
	public static final Item MACHETE_PLUS = register(new MachetePlusItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
