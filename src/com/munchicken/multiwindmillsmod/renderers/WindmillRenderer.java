package com.munchicken.multiwindmillsmod.renderers;

import org.lwjgl.opengl.GL11;

import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.models.ModelWindmill;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class WindmillRenderer extends TileEntitySpecialRenderer {
	
	private static final ResourceLocation texture = new ResourceLocation(Reference.MODID, "textures/models/windmill.png");
	
	private ModelWindmill windmill;
	
	public WindmillRenderer() {
		
		windmill = new ModelWindmill();
		
	} // close constructor

	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8) {
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		windmill.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		
	} // close renderTileEntityAt

} // close class
