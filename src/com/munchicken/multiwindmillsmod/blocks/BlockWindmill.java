package com.munchicken.multiwindmillsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public abstract class BlockWindmill extends Block {
	
	public BlockWindmill() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabMisc);
		
	} // close constructor

} // close class
