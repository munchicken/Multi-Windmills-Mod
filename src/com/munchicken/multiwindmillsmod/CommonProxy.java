package com.munchicken.multiwindmillsmod;

import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerRenderers() {
		
		// Nothing here as the server doesn't render graphics or entities!
		
	} // close registerRenderers
	
	public void registerTileEntities() {
		
		GameRegistry.registerTileEntity(TileEntityWindmill.class, Reference.MODID + "_" + "TileEntity");
		
	} // close registerTileEntities

} // close class
