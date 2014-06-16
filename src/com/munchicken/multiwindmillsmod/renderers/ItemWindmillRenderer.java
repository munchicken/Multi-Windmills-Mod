package com.munchicken.multiwindmillsmod.renderers;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class ItemWindmillRenderer implements IItemRenderer {

	TileEntitySpecialRenderer renderer;
	private TileEntity entity;
	
	public ItemWindmillRenderer(TileEntitySpecialRenderer renderer, TileEntity entity) {
		this.entity = entity;
		this.renderer = renderer;
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		// For inventory I just want to use the icon
		if(type != IItemRenderer.ItemRenderType.INVENTORY)
			return true;
		else return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		// Was having a game crash when rendered with animation while item was in-hand and thrown on the ground, so using a different renderer for those
		switch(type) {
		case EQUIPPED: case EQUIPPED_FIRST_PERSON:
			((WindmillRenderer) this.renderer).renderTileEntityInHandAt(this.entity, 0.00, 0.00, 0.00, 0.00F);
			break;
		case ENTITY:
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
			((WindmillRenderer) this.renderer).renderTileEntityInHandAt(this.entity, 0.00, 0.00, 0.00, 0.00F);
			break;
		default:
			this.renderer.renderTileEntityAt(this.entity, 0.00, 0.00, 0.00, 0.00F);
			break;
		}

	}

}
