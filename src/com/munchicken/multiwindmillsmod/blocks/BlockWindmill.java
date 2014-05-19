package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.MultiWindmillsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class BlockWindmill extends Block {
	
	public BlockWindmill() {
		super(Material.rock);
		this.setCreativeTab(MultiWindmillsMod.tabWindmill);
		
	} // close constructor

} // close class
