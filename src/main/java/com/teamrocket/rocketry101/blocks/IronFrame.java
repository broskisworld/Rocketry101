package com.teamrocket.rocketry101.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IronFrame extends Block {
	public IronFrame() {
		super(Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(2.0f)
				.lightValue(14));
		setRegistryName("ironframe");
	}
}
