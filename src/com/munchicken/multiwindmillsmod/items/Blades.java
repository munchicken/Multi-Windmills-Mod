package com.munchicken.multiwindmillsmod.items;

import com.munchicken.multiwindmillsmod.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Blades extends Item {
	
	public Blades() {
		
		super();
		setUnlocalizedName("Blades");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMisc);
		
	} // close constructor

} // close class
