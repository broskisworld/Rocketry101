package com.teamrocket.rocketry101.items;

import com.teamrocket.rocketry101.Rocketry101;
import net.minecraft.item.Item;

public class CopperIngot extends Item {

    public CopperIngot() {
        super(new Item.Properties()
				.group(Rocketry101.setup.itemGroup)
                .maxStackSize(64));
        setRegistryName("copperingot");
    }
}