package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.items.ModCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class BlockWindmill extends Block {
	
	public BlockWindmill(String name) {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5)); //substring(5) removes "tile."
		setCreativeTab(ModCreativeTabs.tabWindmill);
		
	} // close constructor

} // close class
