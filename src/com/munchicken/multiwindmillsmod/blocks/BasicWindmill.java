package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.help.Reference;

public class BasicWindmill extends BlockWindmill{
	
	public BasicWindmill() {
		
		setBlockName("BasicWindmill");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5)); //substring(5) removes "tile."
		
	} // close constructor

} // close class
