package com.munchicken.multiwindmillsmod.handlers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModSmeltingRecipes {
	
	private static final ModSmeltingRecipes SMELTING_BASE = new ModSmeltingRecipes();
	
	// The list of smelting results.
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	
	// Used to call methods addSmelting and getSmeltingResult.
	public static ModSmeltingRecipes smelting() {
		return SMELTING_BASE;
	} // close
	
	private ModSmeltingRecipes() {
		// insert empty bucket, pumps water and returns bucket filled with water
		this.addRecipe(Items.bucket, new ItemStack(Items.water_bucket), 0.7F); // same experience as Iron Ore -> Ingot
	} // close constructor
	
	public void addRecipe(Item item, ItemStack itemstack, float experience) {
		this.addLists(item, itemstack, experience);
	} // close addRecipe
	
	public void addLists(Item item, ItemStack itemstack, float experience) {
		this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
	} // close addLists
	
	public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience){
		this.smeltingList.put(itemstack, itemstack2);
		this.experienceList.put(itemstack2, Float.valueOf(experience));
	} // close putLists
	
	// Returns the smelting result of an item.
	public ItemStack getSmeltingResult(ItemStack itemstack) {
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;
		
		do {
			if(!iterator.hasNext()) {
				return null;
			} // close if
			entry = (Entry) iterator.next();
		} while (!canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		return (ItemStack) entry.getValue();
	} // close getSmeltingResult
	
	private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
		//return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
		return true;
	} // close canBeSmelted
	
	public float giveExperience(ItemStack itemstack) {
		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;
		
		do {
			if(!iterator.hasNext()) {
				return 0.0F;
			} // close if
			
			entry = (Entry) iterator.next();
		} while(!this.canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		
		if(itemstack.getItem().getSmeltingExperience(itemstack) != -1) {
			return itemstack.getItem().getSmeltingExperience(itemstack);
		} // close if
		
		return (((Float) entry.getValue()).floatValue());
	} // close giveExperience

} // close class
