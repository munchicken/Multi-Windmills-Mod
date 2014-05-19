package com.munchicken.multiwindmillsmod;

import net.minecraft.block.Block;

import com.munchicken.multiwindmillsmod.blocks.BasicWindmill;
import com.munchicken.multiwindmillsmod.help.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MultiWindmillsMod {
	
	public static Block basicWindmill;
     
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	basicWindmill = new BasicWindmill();
    	
    	RegisterHelper.registerBlock(basicWindmill);
		
    } // close preinit
    
} // close class
