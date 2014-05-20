package com.munchicken.multiwindmillsmod.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.munchicken.multiwindmillsmod.blocks.ModBlocks;
import com.munchicken.multiwindmillsmod.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void addRecipes() {
		
    	GameRegistry.addRecipe(new ItemStack(ModItems.blades), new Object[] {
    		"X X",
    		" Y ",
    		"X X",
    		'X', Items.iron_ingot, 'Y', Blocks.iron_block
    		
    	} /* close array */);
    	
    	GameRegistry.addRecipe(new ItemStack(ModItems.pump), new Object[] {
    		" X ",
    		" Y ",
    		'X', Blocks.sticky_piston, 'Y', Items.bucket
    		
    	} /* close array */);
    	
    	GameRegistry.addRecipe(new ItemStack(ModItems.tower), new Object[] {
    		"X X",
    		"XXX",
    		"X X",
    		'X', Blocks.ladder
    		
    	} /* close array */);
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.basicWindmill), new Object[] {
    		" X ",
    		" Y ",
    		" Z ",
    		'X', ModItems.blades, 'Y', ModItems.pump, 'Z', ModItems.tower
    		
    	} /* close array */);
		
	} // close addRecipes

} // close class
