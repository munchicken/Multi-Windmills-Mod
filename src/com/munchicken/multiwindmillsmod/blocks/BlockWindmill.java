package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.creativetabs.ModCreativeTabs;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockWindmill extends BlockContainer {
	
	public BlockWindmill(String name) {
		super(Material.rock);
		setBlockName(name);
		setCreativeTab(ModCreativeTabs.tabWindmill);
		setHardness(35F);
		setResistance(17.5F);
		
	}
	
    /** The type of render function that is called for this block */
	public int getRenderType() {
		
		return -1;
		
	}
	
	/** If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc) */
	public boolean renderAsNormalBlock () {
		
		return false;
		
	}
	
    /** Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block. */
	public boolean isOpaqueCube() {
		
		return false;
		
	}
	
}
