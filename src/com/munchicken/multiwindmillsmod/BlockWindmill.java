package com.munchicken.multiwindmillsmod;

import com.munchicken.multiwindmillsmod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWindmill extends Block {
	
	public BlockWindmill() {
		super(Material.rock);
		setBlockName("Windmill");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMisc);
	} // close BlockWindmill

} // close class
