package net.mcreator.sword.procedures;

import net.minecraft.world.entity.Entity;

public class FireSwordDangShiTiBeiGongJuJiZhongShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
