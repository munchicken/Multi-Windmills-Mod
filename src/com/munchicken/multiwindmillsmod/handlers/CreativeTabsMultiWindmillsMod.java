package com.munchicken.multiwindmillsmod.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.munchicken.multiwindmillsmod.blocks.ModBlocks;

public class CreativeTabsMultiWindmillsMod extends CreativeTabs {
	
	public CreativeTabsMultiWindmillsMod(String tabLabel) {
		
		super(tabLabel);
		
	} // close constructor

	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(ModBlocks.basicWindmill);
	}


} // close class
