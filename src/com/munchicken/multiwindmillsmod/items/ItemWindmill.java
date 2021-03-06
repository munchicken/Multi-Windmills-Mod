package com.munchicken.multiwindmillsmod.items;

import com.munchicken.multiwindmillsmod.creativetabs.ModCreativeTabs;
import com.munchicken.multiwindmillsmod.help.Reference;

import net.minecraft.item.Item;

public abstract class ItemWindmill extends Item {
	
	public ItemWindmill(String name) {
		
		super();
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
		setCreativeTab(ModCreativeTabs.tabWindmill);
		
	}

}
