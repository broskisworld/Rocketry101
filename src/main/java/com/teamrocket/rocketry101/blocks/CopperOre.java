package com.teamrocket.rocketry101.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CopperOre extends Block {
	public CopperOre() {
		super(Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(2.0f)
				.lightValue(14));
		setRegistryName("copperore");
	}
}
