package com.munchicken.multiwindmillsmod.items;

import com.munchicken.multiwindmillsmod.MultiWindmillsMod;
import com.munchicken.multiwindmillsmod.help.Reference;

import net.minecraft.item.Item;

public class Blades extends Item {
	
	public Blades() {
		
		super();
		setUnlocalizedName("Blades");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		//setCreativeTab(CreativeTabs.tabMisc);
		System.out.println(MultiWindmillsMod.tabWindmill);
		setCreativeTab(MultiWindmillsMod.tabWindmill);
		
	} // close constructor

} // close class
