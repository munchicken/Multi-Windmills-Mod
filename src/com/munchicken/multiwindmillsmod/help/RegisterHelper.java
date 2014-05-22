package com.munchicken.multiwindmillsmod.help;

import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterHelper {
	
	public static void registerBlock(Block block) {
		
		GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
		
	} // close registerBlock
	
	public static void registerItem(Item item) {
		
		GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
		
	} // close registerItem
	
	public static void registerTileEntities() {
		
		GameRegistry.registerTileEntity(TileEntityWindmill.class, "Windmill");
		
	} // close registerTileEntities

} // close class
