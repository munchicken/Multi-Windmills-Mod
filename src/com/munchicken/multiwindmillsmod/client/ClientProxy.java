package com.munchicken.multiwindmillsmod.client;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.munchicken.multiwindmillsmod.CommonProxy;
import com.munchicken.multiwindmillsmod.blocks.ModBlocks;
import com.munchicken.multiwindmillsmod.renderers.ItemWindmillRenderer;
import com.munchicken.multiwindmillsmod.renderers.WindmillRenderer;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		
		TileEntitySpecialRenderer renderer = new WindmillRenderer();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, renderer);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.basicWindmill), new ItemWindmillRenderer(renderer, new TileEntityWindmill()));
		
	} // close registerRenderers

} // close class
