package com.munchicken.multiwindmillsmod.help;

import com.munchicken.multiwindmillsmod.MultiWindmillsMod;
import com.munchicken.multiwindmillsmod.handlers.WindmillGuiHandler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper {
	
	/** Registers blocks for mod
	 * 
	 * @param block
	 */
	public static void registerBlock(Block block) {
		
		GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
		
	}
	
	/** Registers items for mod
	 * 
	 * @param item
	 */
	public static void registerItem(Item item) {
		
		GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
		
	}
	
	/** Registers GUIs for mod */
	public static void registerGui() {
		
		NetworkRegistry.INSTANCE.registerGuiHandler(MultiWindmillsMod.instance, new WindmillGuiHandler());
		
	}

}
