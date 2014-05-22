package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BasicWindmill extends BlockWindmill{
	
	public BasicWindmill() {
		
		super("BasicWindmill");
		
	} // close constructor

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityWindmill();
		
	} // close createNewTileEntity

} // close class
