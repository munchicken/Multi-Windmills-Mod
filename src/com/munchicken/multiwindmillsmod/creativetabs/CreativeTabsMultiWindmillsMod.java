package com.munchicken.multiwindmillsmod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.munchicken.multiwindmillsmod.blocks.ModBlocks;

public class CreativeTabsMultiWindmillsMod extends CreativeTabs {
	
	public CreativeTabsMultiWindmillsMod(String tabLabel) {
		
		super(tabLabel);
		
	}

	/** Retreives the icon for the creative tab from the block. */
	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(ModBlocks.basicWindmill);
	}

}
