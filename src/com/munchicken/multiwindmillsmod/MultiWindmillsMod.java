package com.munchicken.multiwindmillsmod;

import com.munchicken.multiwindmillsmod.blocks.ModBlocks;
import com.munchicken.multiwindmillsmod.handlers.ModRecipes;
import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.help.RegisterHelper;
import com.munchicken.multiwindmillsmod.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MultiWindmillsMod {
	    
    @Instance(value = Reference.MODID)
    public static MultiWindmillsMod instance;
	
	@SidedProxy (clientSide = "com.munchicken.multiwindmillsmod.client.ClientProxy", serverSide = "com.munchicken.multiwindmillsmod.CommonProxy")
    public static CommonProxy myProxy;
	
	@EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	
    	myProxy.registerTileEntities();
    	RegisterHelper.registerGui();
    	ModBlocks.loadBlocks();
    	ModItems.loadItems();
    	ModRecipes.addRecipes();
    	myProxy.registerRenderers();
    	
    }
    
}
