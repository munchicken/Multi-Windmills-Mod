package com.munchicken.multiwindmillsmod.items;

import net.minecraft.item.Item;

import com.munchicken.multiwindmillsmod.help.RegisterHelper;

public class ModItems {
	
	public static Item blades;
	
	public static void loadItems() {
		
    	blades = new Blades();
    	
    	RegisterHelper.registerItem(blades);
		
	} // close loadItems

} // close class
