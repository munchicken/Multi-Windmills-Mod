package com.munchicken.multiwindmillsmod.tileentities;

import com.munchicken.multiwindmillsmod.handlers.ModSmeltingRecipes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityWindmill extends TileEntity implements IInventory {

	private ItemStack[] windmillInventory = new ItemStack[2]; // 2 Inventory slots in windmill
	public int pumpTime;  // time to pump bucket of water
	public int pumpSpeed = 200; // matches furnace smelting time
	private String windmillInventoryName;
		
	public void setGuiDisplayName(String name) {
		this.windmillInventoryName = name;
	} // close windmillName
	
	@Override
	public int getSizeInventory() {		
		return this.windmillInventory.length;		
	} // close getSizeInventory

	@Override
	public ItemStack getStackInSlot(int slot) {		
		return this.windmillInventory[slot];		
	} // close getStackInSlot

	@Override
	public ItemStack decrStackSize(int slot, int numOfItems) {		
		if (this.windmillInventory[slot] != null) {
			ItemStack fromSlot;
			if (this.windmillInventory[slot].stackSize <= numOfItems) {
				fromSlot = this.windmillInventory[slot];
				this.windmillInventory[slot] = null;
				return fromSlot;
			} else {
				fromSlot = this.windmillInventory[slot].splitStack(numOfItems);
				if (this.windmillInventory[slot].stackSize == 0) {
					this.windmillInventory[slot] = null;
				} // close if
				return fromSlot;
			} // close else
		} else {
			return null;
		} // close else
		
	} // close decrStackSize

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {		
		if (this.windmillInventory[slot] != null) {
			ItemStack dropStack = this.windmillInventory[slot];
			this.windmillInventory[slot] = null;
			return dropStack;
		} else {
			return null;
		} // close else
		
	} // close getStackInSlotOnClosing

	@Override
	public void setInventorySlotContents(int slot, ItemStack inputStack) {		
		this.windmillInventory[slot] = inputStack;
		if (inputStack != null && inputStack.stackSize > this.getInventoryStackLimit()) {
			inputStack.stackSize = this.getInventoryStackLimit();
		} // end if		
	} // close setInventorySlotContents

	@Override
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.windmillInventoryName : "container.basicWindmill";
	} // close getInventoryName

	@Override
	public boolean hasCustomInventoryName() {
		return this.windmillInventoryName != null && this.windmillInventoryName.length() > 0;		
	} // close hasCustomInventoryName

	@Override
	public int getInventoryStackLimit() {		
		return 1; // Empty buckets stack, but water buckets don't, so leaving at 1		
	} // close getInventoryStackLimit

	@Override
	public void openInventory() {
		
	} // close openInventory

	@Override
	public void closeInventory() {
		
	} // close closeInventory

	// Only allows empty buckets in slot 0 (not items inserted in slot 1)
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack inputStack) {		
		 return slot == 1 ? false : (slot == 0 ? (isEmptyBucket(inputStack)) : false);
	} // close isItemValidForSlot
	
	// tests to see if empty bucket is inserted in slot 0
	private boolean isEmptyBucket(ItemStack inputStack) {		
		ItemStack bucket = new ItemStack(Items.bucket);
		return inputStack.equals(bucket) ? true : false;		
	} // close isEmptyBucket
	
	// restore items in slots from previous game
	public void readFromNBT(NBTTagCompound tagCompound) {
		super.readFromNBT(tagCompound);
		NBTTagList tagList = tagCompound.getTagList("Items", 10);
		this.windmillInventory = new ItemStack[this.getSizeInventory()];
		
		for (int i = 0; i < tagList.tagCount(); ++i) {
			NBTTagCompound tabCompound1 = tagList.getCompoundTagAt(i);
			byte byte0 = tabCompound1.getByte("Slot");
			
			if (byte0 >= 0 && byte0 < this.windmillInventory.length) {
				this.windmillInventory[byte0] = ItemStack.loadItemStackFromNBT(tabCompound1);
				
			} // close if
		} // close for
		
		this.pumpTime = tagCompound.getShort("PumpTime");		
		if (tagCompound.hasKey("WindmillTag", 8)) {
			this.windmillInventoryName = tagCompound.getString("WindmillTag");
		} // end if
	} // close readFromNBT
	
	// save items in slots when game is closed
	public void writeToNBT(NBTTagCompound tagCompound) {
		super.writeToNBT(tagCompound);
		tagCompound.setShort("PumpTime", (short)this.pumpTime);
		NBTTagList tagList = new NBTTagList();
		
		for (int i = 0; i < this.windmillInventory.length; ++i) {
			if (this.windmillInventory[i] != null) {
				NBTTagCompound tagCompound1 = new NBTTagCompound();
				tagCompound1.setByte("Slot", (byte)i);
				this.windmillInventory[i].writeToNBT(tagCompound1);
				tagList.appendTag(tagCompound1);
			} // close if
		} // close for
		
		tagCompound.setTag("Items", tagList);
		
		if (this.hasCustomInventoryName()) {
			tagCompound.setString("WindmillTag", this.windmillInventoryName);
		} // close hasCustomInventoryName
	} // close writeToNBT
	
	// Returns an int between 0 and scaleValue representing how close the bucket is to full
	@SideOnly(Side.CLIENT)
	public int getPumpProgressScaled(int scaleValue) {
		return this.pumpTime * scaleValue / this.pumpSpeed;
	} // close getPumpProgressScaled
		
	public boolean isPumping() {
		return (this.pumpTime > 0);
	} // close isPumping
	
	private boolean canPump() {
		ItemStack itemstack = ModSmeltingRecipes.smelting().getSmeltingResult(this.windmillInventory[0]);
		if ((this.windmillInventory[0] == null) || (this.windmillInventory[1] != null) || (itemstack == null)) {
			return false;
		} else {
			return true;			
		} // close else
	} // close canPump
	
	public void updateEntity() {
		boolean flag = false;  // true when inventory changed
		if (/*(!this.worldObj.isRemote) && */(canPump()) /*&& (isPumping())*/) {
		System.out.println("DEBUG:  In updateEntity");	
		this.pumpTime++;
		System.out.println(this.pumpTime);
			if (this.pumpTime == this.pumpSpeed) {
				this.pumpTime = 0;
				this.smeltItem();
				flag = true;
			}// else {
				//this.pumpTime = 0;
			//} // close else
		} // close if
		
		if (flag) {
			this.markDirty();
		} // close if
	} // close updateEntity

	private void smeltItem() {
		if(this.canPump()) {
			System.out.println("DEBUG:  In smeltItem");
			ItemStack result = ModSmeltingRecipes.smelting().getSmeltingResult(this.windmillInventory[0]);
			this.windmillInventory[1] = result.copy();
			this.windmillInventory[0].stackSize--;
			if(this.windmillInventory[0].stackSize <= 0) {
				this.windmillInventory[0] = null;
			} // close if
		} // close if
	} // close smeltItem
	
	public boolean isUseableByPlayer (EntityPlayer player) {
		return true; // simple for now, may change later
	} // close isUseableByPlayer

} // close class
