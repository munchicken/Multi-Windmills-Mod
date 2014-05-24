package com.munchicken.multiwindmillsmod.client;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

import com.munchicken.multiwindmillsmod.CommonProxy;
import com.munchicken.multiwindmillsmod.handlers.WindmillRenderer;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		
		TileEntitySpecialRenderer renderer = new WindmillRenderer();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, renderer);
		
	} // close registerRenderers

} // close class
