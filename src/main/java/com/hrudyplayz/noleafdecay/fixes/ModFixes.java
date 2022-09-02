package com.hrudyplayz.noleafdecay.fixes;

import java.util.Random;

import net.minecraft.block.BlockLeavesBase;
import net.minecraft.world.World;

import net.tclproject.mysteriumlib.asm.annotations.EnumReturnSetting;
import net.tclproject.mysteriumlib.asm.annotations.Fix;

@SuppressWarnings("unused")
public class ModFixes {

	@Fix(returnSetting = EnumReturnSetting.ON_TRUE, allThatExtend = true)
	public static boolean updateTick(BlockLeavesBase instance, World world, int x, int y, int z, Random random) {
		return true;
	}

}
