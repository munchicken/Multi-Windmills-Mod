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
		//GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		/* Scaled model in half from 2x6x2 (which represented a common 20' windmill) to fit 1x1
		due to clipping and right-click problems with a model larger than 1x1
		with glTranslatef & glScalef */
		GL11.glTranslatef((float) x + 0.26F, (float) y + 0.75F, (float) z + 0.25F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		GL11.glPushMatrix();
		windmill.renderModel(0.0625F);
		windmill.setHeadRotation(var1.getWorldObj().getWorldTime()); // wind changes direction randomly
		windmill.setWheelRotation(var1.getWorldObj().getWorldTime()); // wheel constantly turns
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		
	} // close renderTileEntityAt
	
} // close class
