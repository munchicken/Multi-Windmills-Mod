package com.munchicken.multiwindmillsmod;

import com.munchicken.multiwindmillsmod.blocks.ModBlocks;
import com.munchicken.multiwindmillsmod.handlers.ModRecipes;
import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.help.RegisterHelper;
import com.munchicken.multiwindmillsmod.items.ModItems;
import com.munchicken.multiwindmillsmod.models.ModModels;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MultiWindmillsMod {
	    
    @SidedProxy (clientSide = "com.munchicken.multiwindmillsmod.client.ClientProxy", serverSide = "com.munchicken.multiwindmillsmod.CommonProxy")
    public static CommonProxy myProxy;
    
	@EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	RegisterHelper.registerTileEntities();
    	ModModels.loadModels();
    	ModBlocks.loadBlocks();
    	ModItems.loadItems();
    	ModRecipes.addRecipes();
    	myProxy.registerRenderers();
    	
    } // close preinit
    
} // close class
