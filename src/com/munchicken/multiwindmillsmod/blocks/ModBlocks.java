package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block basicWindmill;
	
	/** Creates and registers new blocks added by this Mod */
	public static void loadBlocks() {
		
    	basicWindmill = new BasicWindmill();
    	
    	RegisterHelper.registerBlock(basicWindmill);
		
	}

}
