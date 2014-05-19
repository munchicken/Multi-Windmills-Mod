package com.munchicken.multiwindmillsmod.items;

import net.minecraft.item.Item;

import com.munchicken.multiwindmillsmod.help.RegisterHelper;

public class ModItems {
	
	public static Item blades;
	public static Item pump;
	public static Item tower;
	
	public static void loadItems() {
		
    	blades = new Blades();
    	RegisterHelper.registerItem(blades);
    	
    	pump = new Pump();
    	RegisterHelper.registerItem(pump);
    	
    	tower = new Tower();
    	RegisterHelper.registerItem(tower);
		
	} // close loadItems

} // close class
