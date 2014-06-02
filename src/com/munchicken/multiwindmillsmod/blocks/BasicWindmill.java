package com.munchicken.multiwindmillsmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.munchicken.multiwindmillsmod.MultiWindmillsMod;
import com.munchicken.multiwindmillsmod.gui.ModGuis;
import com.munchicken.multiwindmillsmod.help.Reference;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//  BasicWindmill = first windmill I created, will probably change names later
public class BasicWindmill extends BlockWindmill {
	
	private Random rand = new Random();
	
	public BasicWindmill() {
		
		super("BasicWindmill");
		// set approximately 20ft tall (6 blocks) x 2 blocks wide, but later scaled down to 1x3x1
		setBlockBounds(0F, 0F, 0F, 1F, 3F, 1F);
		
	}
	
    /** Returns a new instance of a block's tile entity class. Called on placing the block. */
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityWindmill();
		
	} // close createNewTileEntity
	
	/** Registers block icons with icon register */
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		// Icons for use in inventory
		blockIcon = iconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
		
	}

    /** Called upon block activation (right click on the block.) */
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		player.openGui(MultiWindmillsMod.instance, ModGuis.guiIdBasicWindmill, world, x, y, z);
		return true;
		
	}
	
    /** Called when the block is placed in the world. */
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
		if (itemstack.hasDisplayName()) {
			((TileEntityWindmill)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
		}
	}
	
	/** Called when block is broken */
	public void breakBlock(World world, int x, int y, int z, Block oldBlock, int oldMeta) {
		// dumps items that are in slots onto the ground when windmills is broken
		TileEntityWindmill tileEntity = (TileEntityWindmill) world.getTileEntity(x, y, z);
		
		if(tileEntity != null) {
			for(int i = 0; i < tileEntity.getSizeInventory(); i++) {
				ItemStack itemstack = tileEntity.getStackInSlot(i);
				
				if(itemstack != null) {
					float f = this.rand.nextFloat() * 0.8F + 0.1F;
					float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
					float f2 = this.rand.nextFloat() * 0.8F + 0.1F;
					
					while(itemstack.stackSize > 0) {
						int j = this.rand.nextInt(21) + 10;
						
						if(j > itemstack.stackSize) {
							j = itemstack.stackSize;
						}
						
						itemstack.stackSize -= j;
						
						EntityItem item = new EntityItem(world, (double)((float)x + f), (double)((float)y +f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));
						
						if(itemstack.hasTagCompound()) {
							item.getEntityItem().setTagCompound((NBTTagCompound) itemstack.getTagCompound().copy());
						}
						
						float f3 = 0.05F;
						item.motionX = (double)((float)this.rand.nextGaussian() * f3);
						item.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
						item.motionZ = (double)((float)this.rand.nextGaussian() * f3);
						
						world.spawnEntityInWorld(item);
						
					}
				}
			}
			world.func_147453_f(x, y, z, oldBlock);
		}
		
		super.breakBlock(world, x, y, z, oldBlock, oldMeta);
	}
	
    /** A randomly called display update to be able to add particles or other items for display */
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		TileEntityWindmill tileEntity = (TileEntityWindmill) world.getTileEntity(x, y, z);
		 
		if(tileEntity.isPumping()) {
		
			 float r = random.nextFloat();
			// displays water splashing around windmill while pumping			 
			 world.spawnParticle("splash", (double)(x + r), (double)(y + 0.75), (double)(z + r), 0.0D, 0.0D, 0.0D);
		 }
	}
	
}
