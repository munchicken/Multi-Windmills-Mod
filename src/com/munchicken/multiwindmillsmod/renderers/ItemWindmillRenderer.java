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
		if(type == IItemRenderer.ItemRenderType.ENTITY)
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
		this.renderer.renderTileEntityAt(this.entity, 0.00, 0.00, 0.00, 0.00F);
	}

}
