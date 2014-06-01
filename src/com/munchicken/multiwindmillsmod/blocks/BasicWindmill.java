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
		// set approximately 20ft tall (6 blocks) x 2 blocks wide
		setBlockBounds(0F, 0F, 0F, 2F, 7F, 2F);
		
	} // close constructor
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityWindmill();
		
	} // close createNewTileEntity
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		// Icons for use in inventory
		blockIcon = iconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
		
	} // close registerBlockIcons

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		// not sure if this is needed, so commented out for now
		//if(!world.isRemote) {
			
			player.openGui(MultiWindmillsMod.instance, ModGuis.guiIdBasicWindmill, world, x, y, z);
			
		//} // end if
		
		return true;
		
	} // close onBlockActivated
	
    //Called when the block is placed in the world.
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
		if (itemstack.hasDisplayName()) {
			((TileEntityWindmill)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
		} // close if
	} // close OnBlockPlacedBy
	
	// dumps items that are in slots onto the ground when windmills is broken
	public void breakBlock(World world, int x, int y, int z, Block oldBlock, int oldMeta) {
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
			world.func_147453_f(x, y, z, oldBlock);;
		}
		
		super.breakBlock(world, x, y, z, oldBlock, oldMeta);
	} // close breakBlock
	
	// displays water splashing around windmill while pumping
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		TileEntityWindmill tileEntity = (TileEntityWindmill) world.getTileEntity(x, y, z);
		 
		if(tileEntity.isPumping()) {
		

			 float y1 = (float)y + random.nextFloat();

			 float f1 = random.nextFloat() * 1F - 0.3F;
			 			 
			 world.spawnParticle("splash", (x + 1 + f1), (double)y1, (double)(z + 1 + f1), 0.0D, 0.0D, 0.0D);
		 }
	}
	
} // close class
