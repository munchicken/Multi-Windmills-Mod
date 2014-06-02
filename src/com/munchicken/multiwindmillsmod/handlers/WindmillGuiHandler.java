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

    /**
     * Returns a Server side Container to be displayed to the user.
     *
     * @param ID The Gui ID Number
     * @param player The player viewing the Gui
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @return A GuiScreen/Container to be displayed to the user, null if none.
     */
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (entity != null) {
			switch (ID) {
			case ModGuis.guiIdBasicWindmill:
				if (entity instanceof TileEntityWindmill) {
					return new ContainerWindmill(player.inventory, (TileEntityWindmill)entity);
				}
			}
		}
		
		return null;
	}

    /**
     * Returns a Container to be displayed to the user. On the client side, this
     * needs to return a instance of GuiScreen On the server side, this needs to
     * return a instance of Container
     *
     * @param ID The Gui ID Number
     * @param player The player viewing the Gui
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @return A GuiScreen/Container to be displayed to the user, null if none.
     */
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (entity != null) {
			switch (ID) {
			case ModGuis.guiIdBasicWindmill:
				if (entity instanceof TileEntityWindmill) {
					return new GuiWindmill(player.inventory, (TileEntityWindmill)entity);
				}
			}
		}
		
		return null;
	}

}
