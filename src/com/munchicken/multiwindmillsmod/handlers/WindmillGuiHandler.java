package com.munchicken.multiwindmillsmod.handlers;

import com.munchicken.multiwindmillsmod.gui.GuiWindmill;
import com.munchicken.multiwindmillsmod.gui.ModGuis;
import com.munchicken.multiwindmillsmod.inventory.ContainerWindmill;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class WindmillGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (entity != null) {
			switch (ID) {
			case ModGuis.guiIdBasicWindmill:
				if (entity instanceof TileEntityWindmill) {
					return new ContainerWindmill(player.inventory, (TileEntityWindmill)entity);
				} // close if
			} // close switch
		} // close if
		
		return null;
	} // close getServerGuiElement

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (entity != null) {
			switch (ID) {
			case ModGuis.guiIdBasicWindmill:
				if (entity instanceof TileEntityWindmill) {
					return new GuiWindmill(player.inventory, (TileEntityWindmill)entity);
				} // close if
			} // close switch
		} // close if
		
		return null;
	} // close getclientGuiElement

} // close class
