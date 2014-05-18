package com.munchicken.multiwindmillsmod;

import net.minecraft.block.Block;

import com.munchicken.multiwindmillsmod.blocks.BlockWindmill;
import com.munchicken.multiwindmillsmod.help.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MultiWindmillsMod {
	
	public static Block windmill;
     
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	windmill = new BlockWindmill();
    	
    	RegisterHelper.registerBlock(windmill);
		
    } // close preinit
    
} // close class
