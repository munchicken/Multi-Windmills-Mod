package com.munchicken.multiwindmillsmod.blocks;

import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
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
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		blockIcon = iconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		
	} // close registerBlockIcons

} // close class
