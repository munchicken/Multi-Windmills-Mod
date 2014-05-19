package com.munchicken.multiwindmillsmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsMultiWindmillsMod extends CreativeTabs {
	
	public CreativeTabsMultiWindmillsMod(String tabLabel) {
		
		super(tabLabel);
		
	} // close constructor

	@Override
	public Item getTabIconItem() {
		
		return ModItems.blades;
	}

} // close class
