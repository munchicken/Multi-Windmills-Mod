package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.handlers.ModCreativeTabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockWindmill extends BlockContainer {
	
	public BlockWindmill(String name) {
		super(Material.rock);
		setBlockName(name);
		setCreativeTab(ModCreativeTabs.tabWindmill);
		setHardness(35F);
		setResistance(17.5F);
		
	} // close constructor
	
	public int getRenderType() {
		
		return -1;
		
	} // close getRenderType
	
	public boolean renderAsNormalBlock () {
		
		return false;
		
	} // close renderAsNormalBlock
	
	public boolean isOpaqueCube() {
		
		return false;
		
	} // close isOpaqueCube
	

} // close class
