package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.handlers.ModCreativeTabs;
import com.munchicken.multiwindmillsmod.help.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockWindmill extends BlockContainer {
	
	public BlockWindmill(String name) {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5)); //substring(5) removes "tile."
		setCreativeTab(ModCreativeTabs.tabWindmill);
		
	} // close constructor
	
	public int getRenderType() {
		
		return -1;
		
	} // close getRenderType
	
	/*public boolean renderAsNormalBlock () {
		
		return false;
		
	} // close renderAsNormalBlock
	*/
	public boolean isOpaqueCube() {
		
		return false;
		
	} // close isOpaqueCube
	

} // close class
