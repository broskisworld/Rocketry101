package com.teamrocket.rocketry101.setup;

import com.teamrocket.rocketry101.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("rocketry101") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.COPPERORE);
        }
    };

    public void init() {

    }
}