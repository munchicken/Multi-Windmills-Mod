package com.munchicken.multiwindmillsmod;

import com.munchicken.multiwindmillsmod.blocks.ModBlocks;
import com.munchicken.multiwindmillsmod.help.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MultiWindmillsMod {
     
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	ModBlocks.loadBlocks();
		
    } // close preinit
    
} // close class
