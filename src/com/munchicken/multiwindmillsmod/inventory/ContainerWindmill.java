package com.munchicken.multiwindmillsmod.inventory;

import com.munchicken.multiwindmillsmod.handlers.ModSmeltingRecipes;
import com.munchicken.multiwindmillsmod.tileentities.TileEntityWindmill;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;

public class ContainerWindmill  extends Container {
	
	private TileEntityWindmill tileWindmill;
	private int lastPumpTime;
	public static final int INPUT = 0, OUTPUT = 1;
	
	
	public ContainerWindmill(InventoryPlayer invPlayer, TileEntityWindmill tileEntityWindmill) {
		
		this.tileWindmill = tileEntityWindmill;
		// Windmill has 2 slots
		this.addSlotToContainer(new Slot(tileEntityWindmill, INPUT, 56, 53));
		this.addSlotToContainer(new SlotFurnace(invPlayer.player, tileEntityWindmill, OUTPUT, 116, 35)); // using furnace smelting methods for "pumping"
		int i;
		
		// player inventory slots, 3 rows x 9 columns = 27 slots, OUTPUT + 1 to OUTPUT + 27
		for(i = 0; i < 3; ++i) {
			
			for(int j = 0; j < 9; ++j) {
				
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
				
				} // close for
			
			} // close for
		
		// player hotbar, 9 slots, OUTPUT + 27 + 1 to OUTPUT + 27 + 1 + 9
		for(i = 0; i < 9; ++i) {
			
			this.addSlotToContainer(new Slot(invPlayer, i , 8 + i * 18 , 142));
			
			} // close for
		
	} // close constructor
	
	public void addCraftingToCrafters(ICrafting craft) {
		super.addCraftingToCrafters(craft);
		craft.sendProgressBarUpdate(this, 0, this.tileWindmill.pumpTime);
		craft.sendProgressBarUpdate(this, 1, this.tileWindmill.pumpTime);
	} // close addCraftingToCrafters
	
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for(int i = 0; i < this.crafters.size(); ++i) {
			ICrafting craft = (ICrafting)this.crafters.get(i);
			
			if(this.lastPumpTime != this.tileWindmill.pumpTime) {
				craft.sendProgressBarUpdate(this, 0, this.tileWindmill.pumpTime);
				craft.sendProgressBarUpdate(this, 1, this.tileWindmill.pumpTime); // trying to animate the "burn time" area too 
			} // close if
		} // close for
		
		this.lastPumpTime = this.tileWindmill.pumpTime;
		
	} // close detectAndSendChanges
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int slot, int newValue) {
		if(slot == 0) {
			this.tileWindmill.pumpTime = newValue;
		} // close if
	} // close updateProgressBar

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		
		return this.tileWindmill.isUseableByPlayer(player);
	} // close canInteractWith
	
	// Called when a player shift-clicks on a slot.
	public ItemStack transferStackInSlot(EntityPlayer player, int shiftClickedSlotNumber) {
		
		/*// causing crash from windmill slots, others ok, will work on later
		return null;*/
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(shiftClickedSlotNumber);
		
		if(slot != null && slot.getHasStack()) {
			
			ItemStack itemstack1 = slot.getStack(); // test stack
			itemstack = itemstack1.copy();
			
			if(shiftClickedSlotNumber == OUTPUT) {
				
				// tries merging test stack in slots 2-38 (windmill slots are 0 & 1, 2-37 are player slots), the +1 is for mergeItemStack's <
				if(!this.mergeItemStack(itemstack1, OUTPUT + 1, OUTPUT + 36 + 1, true)) {
					
					return null;
					
				} // close if
				
				slot.onSlotChange(itemstack1, itemstack);  // completes merge if successful
				
			} else if(shiftClickedSlotNumber != INPUT) {
				// if shift clicked player inventory slot (not input or output slot (from previous if))
					
				if(ModSmeltingRecipes.smelting().getSmeltingResult(itemstack1) != null){
					// can item be crafted
						
					if(!this.mergeItemStack(itemstack1, INPUT, INPUT + 1, false)){
						//tries merging test stack in slot 0, the +1 is for mergeItemStack's <
							
						return null;
							
					} // close if
						
				} else if(shiftClickedSlotNumber >= OUTPUT + 1 && shiftClickedSlotNumber < OUTPUT + 28) {
					// is slot in player inventory, not hotbar
								
					if(!this.mergeItemStack(itemstack1, OUTPUT + 28, OUTPUT + 37, false)) {
						// try merging test stack in slots on hotbar
									
						return null;
									
					} // close if
								
				} else if(shiftClickedSlotNumber >= OUTPUT + 28 && shiftClickedSlotNumber < OUTPUT + 37 && !this.mergeItemStack(itemstack1, OUTPUT + 1, OUTPUT + 28, false)) {
					// if slot is in hotbar & try merging in player inventory slots
					
					return null;
					
				}
				
			} else if(!this.mergeItemStack(itemstack1, OUTPUT + 1, OUTPUT + 37, false)) {
				// if input slot is shift clicked
				
					return null;
					
			} // close else
				
			if(itemstack1.stackSize == 0) {
				// shift-clicked stack is completely moved
				
				slot.putStack((ItemStack)null);
				
			} else {
				// shift-clicked stack not completely moved
				
				slot.onSlotChanged();
				
			} // close else
				
			if(itemstack1.stackSize == itemstack.stackSize) {
				
				return null;
				
			} // close if
				
			slot.onPickupFromSlot(player, itemstack1);
			
		} // close else
			
		return itemstack;
		
	} // close transferStackInSlot

} // close class
