package com.munchicken.multiwindmillsmod.handlers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModSmeltingRecipes {
	// All smelting recipes for this mod.
	
	private static final ModSmeltingRecipes SMELTING_BASE = new ModSmeltingRecipes();
	
	// The list of smelting results.
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	
	/** Used to call methods addSmelting and getSmeltingResult.
	 * 
	 * @return
	 */
	public static ModSmeltingRecipes smelting() {
		return SMELTING_BASE;
	}
	
	private ModSmeltingRecipes() {
		// insert empty bucket, pumps water and returns bucket filled with water
		this.addRecipe(Items.bucket, new ItemStack(Items.water_bucket), 0.7F); // same experience as Iron Ore -> Ingot
	}
	
	/** Adds new recipe results to the smelting results list
	 * 
	 * @param item
	 * @param itemstack
	 * @param experience
	 */
	public void addRecipe(Item item, ItemStack itemstack, float experience) {
		this.addLists(item, itemstack, experience);
	}
	
	/** Completes adding the new recipe results to the smeling results list
	 * 
	 * @param item
	 * @param itemstack
	 * @param experience
	 */
	public void addLists(Item item, ItemStack itemstack, float experience) {
		this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
	}
	
	/** Places the smelting result and experience from smelting into seperate lists
	 * 
	 * @param itemstack
	 * @param itemstack2
	 * @param experience
	 */
	public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience){
		this.smeltingList.put(itemstack, itemstack2);
		this.experienceList.put(itemstack2, Float.valueOf(experience));
	}
	
	/** Returns the smelting result of an item.
	 * 
	 * @param itemstack
	 * @return
	 */
	public ItemStack getSmeltingResult(ItemStack itemstack) {
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;
		
		do {
			if(!iterator.hasNext()) {
				return null;
			}
			entry = (Entry) iterator.next();
		} while (!canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		return (ItemStack) entry.getValue();
	}
	
	/** Returns whether the item produces a smelting result
	 * 
	 * @param itemstack
	 * @param itemstack2
	 * @return
	 */
	private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
		// causing game crash, will investigate
		//return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
		return true;
	}
	
	/** Returns experience value
	 * 
	 * @param itemstack
	 * @return
	 */
	public float giveExperience(ItemStack itemstack) {
		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;
		
		do {
			if(!iterator.hasNext()) {
				return 0.0F;
			}
			
			entry = (Entry) iterator.next();
		} while(!this.canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		
		if(itemstack.getItem().getSmeltingExperience(itemstack) != -1) {
			return itemstack.getItem().getSmeltingExperience(itemstack);
		}
		
		return (((Float) entry.getValue()).floatValue());
	}

}
