package com.munchicken.multiwindmillsmod;

import net.minecraft.creativetab.CreativeTabs;

import com.munchicken.multiwindmillsmod.blocks.ModBlocks;
import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.items.CreativeTabsMultiWindmillsMod;
import com.munchicken.multiwindmillsmod.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MultiWindmillsMod {
	
	public static CreativeTabs tabWindmill = new CreativeTabsMultiWindmillsMod("MultiWindmillsMod");
     
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	ModBlocks.loadBlocks();
    	ModItems.loadItems();
		
    } // close preinit
    
} // close class
