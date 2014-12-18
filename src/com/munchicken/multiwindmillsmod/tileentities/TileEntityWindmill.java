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
	public int pumpSpeed = 400; // double furnace smelting time (increased from 200 based on feedback from tester)
	private String windmillInventoryName;
		
	/** Sets the custom name for the GUI
	 * 
	 * @param name
	 */
	public void setGuiDisplayName(String name) {
		this.windmillInventoryName = name;
	}
	
	/** Returns the number of slots in the inventory. */
	@Override
	public int getSizeInventory() {		
		return this.windmillInventory.length;		
	}

	/** Returns the stack in slot i */
	@Override
	public ItemStack getStackInSlot(int slot) {		
		return this.windmillInventory[slot];		
	}

	/** Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
	 */
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
				}
				return fromSlot;
			}
		} else {
			return null;
		}
		
	}

	/** When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
	 */
	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {		
		if (this.windmillInventory[slot] != null) {
			ItemStack dropStack = this.windmillInventory[slot];
			this.windmillInventory[slot] = null;
			return dropStack;
		} else {
			return null;
		}
		
	}

	/** Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections). */
	@Override
	public void setInventorySlotContents(int slot, ItemStack inputStack) {		
		this.windmillInventory[slot] = inputStack;
		if (inputStack != null && inputStack.stackSize > this.getInventoryStackLimit()) {
			inputStack.stackSize = this.getInventoryStackLimit();
		}	
	}

	/** Returns the name of the inventory */
	@Override
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.windmillInventoryName : "container.basicWindmill";
	}

	/** Returns if the inventory is named */
	@Override
	public boolean hasCustomInventoryName() {
		return this.windmillInventoryName != null && this.windmillInventoryName.length() > 0;		
	}

	/** Returns the maximum stack size for a inventory slot. */
	@Override
	public int getInventoryStackLimit() {	
		return 64;	
	}

	@Override
	public void openInventory() {
		
	}

	@Override
	public void closeInventory() {
		
	}

	/** Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot. */
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack inputStack) {
		// Only allows empty buckets in slot 0 (not items inserted in slot 1)
		 return slot == 1 ? false : (slot == 0 ? (isEmptyBucket(inputStack)) : false);
	}
	
	/** tests to see if empty bucket is inserted in slot 0
	 * 
	 * @param inputStack
	 * @return
	 */
	private boolean isEmptyBucket(ItemStack inputStack) {		
		ItemStack bucket = new ItemStack(Items.bucket);
		return inputStack.equals(bucket) ? true : false;		
	}
	
	/** Reads the entity from NBT (calls an abstract helper method to read specialized data) */
	public void readFromNBT(NBTTagCompound tagCompound) {
		// restore items in slots from previous game
		super.readFromNBT(tagCompound);
		NBTTagList tagList = tagCompound.getTagList("Items", 10);
		this.windmillInventory = new ItemStack[this.getSizeInventory()];
		
		for (int i = 0; i < tagList.tagCount(); ++i) {
			NBTTagCompound tabCompound1 = tagList.getCompoundTagAt(i);
			byte byte0 = tabCompound1.getByte("Slot");
			
			if (byte0 >= 0 && byte0 < this.windmillInventory.length) {
				this.windmillInventory[byte0] = ItemStack.loadItemStackFromNBT(tabCompound1);
				
			}
		}
		
		this.pumpTime = tagCompound.getShort("PumpTime");		
		if (tagCompound.hasKey("WindmillTag", 8)) {
			this.windmillInventoryName = tagCompound.getString("WindmillTag");
		}
	}
	
	/** Save the entity to NBT (calls an abstract helper method to write extra data) */
	public void writeToNBT(NBTTagCompound tagCompound) {
		// save items in slots when game is closed
		super.writeToNBT(tagCompound);
		tagCompound.setShort("PumpTime", (short)this.pumpTime);
		NBTTagList tagList = new NBTTagList();
		
		for (int i = 0; i < this.windmillInventory.length; ++i) {
			if (this.windmillInventory[i] != null) {
				NBTTagCompound tagCompound1 = new NBTTagCompound();
				tagCompound1.setByte("Slot", (byte)i);
				this.windmillInventory[i].writeToNBT(tagCompound1);
				tagList.appendTag(tagCompound1);
			}
		}
		
		tagCompound.setTag("Items", tagList);
		
		if (this.hasCustomInventoryName()) {
			tagCompound.setString("WindmillTag", this.windmillInventoryName);
		}
	}
	
	/** Returns an int between 0 and scaleValue representing how close the bucket is to full
	 * 
	 * @param scaleValue
	 * @return
	 */
	@SideOnly(Side.CLIENT)
	public int getPumpProgressScaled(int scaleValue) {
		return this.pumpTime * scaleValue / this.pumpSpeed;
	}
		
	/** Returns whether water is currently being pumped
	 * 
	 * @return
	 */
	public boolean isPumping() {
		return (this.pumpTime > 0);
	}
	
	/** Checks whether input produces a crafting result
	 * 
	 * @return
	 */
	private boolean canPump() {
		ItemStack itemstack = ModSmeltingRecipes.smelting().getSmeltingResult(this.windmillInventory[0]);
		if ((this.windmillInventory[0] == null) || (this.windmillInventory[1] != null) || (itemstack == null)) {
			return false;
		} else {
			return true;			
		}
	}
	
	/** Checks if item has been pumped and updates the entity */
	public void updateEntity() {
		boolean flag = false;  // true when inventory changed
		if (canPump()) {
		this.pumpTime++;
			if (this.pumpTime == this.pumpSpeed) {
				this.pumpTime = 0;
				this.smeltItem();
				flag = true;
			}
		}
		
		if (flag) {
			this.markDirty();
		}
	}

	/** Places crafting result in the output slot and removes an input item */
	private void smeltItem() {
		if(this.canPump()) {
			ItemStack result = ModSmeltingRecipes.smelting().getSmeltingResult(this.windmillInventory[0]);
			this.windmillInventory[1] = result.copy();
			this.windmillInventory[0].stackSize--;
			if(this.windmillInventory[0].stackSize <= 0) {
				this.windmillInventory[0] = null;
			}
		}
	}
	
	/** Do not make give this method the name canInteractWith because it clashes with Container */
	public boolean isUseableByPlayer (EntityPlayer player) {
		return true; // simple for now, may change later
	}

}
