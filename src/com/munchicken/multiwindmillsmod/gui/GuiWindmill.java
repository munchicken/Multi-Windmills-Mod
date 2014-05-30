package com.munchicken.multiwindmillsmod.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.inventory.ContainerWindmill;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiWindmill extends GuiContainer {

	public static final ResourceLocation texture = new ResourceLocation(Reference.MODID, "textures/gui/windmillgui.png");
	private TileEntityWindmill tileWindmill;
	
	public GuiWindmill(InventoryPlayer inventory, TileEntityWindmill entity) {
		
		super(new ContainerWindmill(inventory, entity));
		this.tileWindmill = entity;
		
		this.xSize = 176;
		this.ySize = 166;
		
	} // close constructor
	
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		
		String string = this.tileWindmill.hasCustomInventoryName() ? this.tileWindmill.getInventoryName() : I18n.format(this.tileWindmill.getInventoryName(), new Object[0]);
		this.fontRendererObj.drawString(string, this.xSize / 2 - this.fontRendererObj.getStringWidth(string) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
				
	} // close drawGuiContainerForegroundLayer
	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(texture);
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
		int k;
		
		k = this.tileWindmill.getPumpProgressScaled(12);
		this.drawTexturedModalRect(guiLeft + 56, guiTop + 36, 176, 0, 14, k + 2); // water will drip from the top, rather than flame rising up
		
		k = this.tileWindmill.getPumpProgressScaled(24);
		this.drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 14, k + 1, 16);
		
	} // close drawGuiContainerBackgroundLayer

} // close class
