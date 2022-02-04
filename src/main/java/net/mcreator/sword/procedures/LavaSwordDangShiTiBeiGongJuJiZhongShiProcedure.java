package net.mcreator.sword.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class LavaSwordDangShiTiBeiGongJuJiZhongShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			FallingBlockEntity blockToSpawn = new FallingBlockEntity(_level, x, y, z, Blocks.MAGMA_BLOCK.defaultBlockState());
			blockToSpawn.time = 1;
			_level.addFreshEntity(blockToSpawn);
		}
		entity.setSecondsOnFire(10);
	}
}
