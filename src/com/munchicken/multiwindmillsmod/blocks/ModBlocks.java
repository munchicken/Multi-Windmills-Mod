package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block basicWindmill;
	
	public static void loadBlocks() {
		
    	basicWindmill = new BasicWindmill();
    	
    	RegisterHelper.registerBlock(basicWindmill);
		
	} // close loadBlocks

} // close class
