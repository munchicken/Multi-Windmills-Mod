// Date: 5/23/2014 10:39:33 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.munchicken.multiwindmillsmod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWindmill extends ModelBase
{
  //fields
    ModelRenderer Platform;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Spindle;
    ModelRenderer Axel;
    ModelRenderer Vane1;
    ModelRenderer Vane2;
    ModelRenderer Vane3;
    ModelRenderer Blade1Part1;
    ModelRenderer Blade1Part2;
    ModelRenderer Blade1Part3;
    ModelRenderer Blade1Part4;
    ModelRenderer Blade2Part1;
    ModelRenderer Blade2Part2;
    ModelRenderer Blade2Part3;
    ModelRenderer Blade2Part4;
    ModelRenderer Blade3Part1;
    ModelRenderer Blade3Part2;
    ModelRenderer Blade3Part3;
    ModelRenderer Blade3Part4;
    ModelRenderer Blade4Part1;
    ModelRenderer Blade4Part2;
    ModelRenderer Blade4Part3;
    ModelRenderer Blade4Part4;
    ModelRenderer Blade5Part1;
    ModelRenderer Blade5Part2;
    ModelRenderer Blade5Part3;
    ModelRenderer Blade5Part4;
    ModelRenderer Blade6Part1;
    ModelRenderer Blade6Part2;
    ModelRenderer Blade6Part3;
    ModelRenderer Blade6Part4;
    ModelRenderer Blade7Part1;
    ModelRenderer Blade7Part2;
    ModelRenderer Blade7Part3;
    ModelRenderer Blade7Part4;
    ModelRenderer Blade8Part1;
    ModelRenderer Blade8Part2;
    ModelRenderer Blade8Part3;
    ModelRenderer Blade8Part4;
    ModelRenderer Cross1;
    ModelRenderer Cross2;
    ModelRenderer Cross3;
    ModelRenderer Cross4;
    ModelRenderer Cross6;
    ModelRenderer Cross7;
    ModelRenderer Cross8;
    ModelRenderer Cross9;
    ModelRenderer Cross10;
    ModelRenderer Cross11;
    ModelRenderer Cross12;
    ModelRenderer Cross13;
    ModelRenderer Cross14;
    ModelRenderer Cross15;
    ModelRenderer Cross16;
    ModelRenderer Cross17;
    ModelRenderer Cross18;
    ModelRenderer Cross19;
    ModelRenderer Cross20;
    ModelRenderer Cross21;
    ModelRenderer Cross22;
    ModelRenderer Cross23;
    ModelRenderer Cross24;
    ModelRenderer Cross25;
    ModelRenderer Tower;  // Will be parent to bottom-of-windmill items for more code organization
    ModelRenderer Head;  // Will be parent to top-of-windmill items for later animation
    ModelRenderer Wheel; // Will be parent of all blades and child of Head for later animation
  
  public ModelWindmill()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Platform = new ModelRenderer(this, 63, 0);
      Platform.addBox(-8F, -28F, -8F, 16, 1, 16);
      Platform.setRotationPoint(8F, -29F, 8F);
      Platform.setTextureSize(64, 32);
      Platform.mirror = true;
      setRotation(Platform, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 119, 0);
      Leg1.addBox(-10F, -25F, -10F, 2, 81, 2);
      Leg1.setRotationPoint(8F, -29F, 8F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, -0.1047198F, 0F, 0.1047198F);
      Leg2 = new ModelRenderer(this, 119, 0);
      Leg2.addBox(8F, -25F, -10F, 2, 81, 2);
      Leg2.setRotationPoint(8F, -29F, 8F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, -0.1047198F, 0F, -0.1047198F);
      Leg3 = new ModelRenderer(this, 119, 0);
      Leg3.addBox(8F, -25F, 8F, 2, 81, 2);
      Leg3.setRotationPoint(8F, -29F, 8F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0.1047198F, 0F, -0.1047198F);
      Leg4 = new ModelRenderer(this, 119, 0);
      Leg4.addBox(-10F, -25F, 8F, 2, 81, 2);
      Leg4.setRotationPoint(8F, -29F, 8F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0.1047198F, 0F, 0.1047198F);
      Spindle = new ModelRenderer(this, 0, 0);
      Spindle.addBox(0F, -30F, 0F, 1, 2, 1);
      Spindle.setRotationPoint(8F, -29F, 8F);
      Spindle.setTextureSize(64, 32);
      Spindle.mirror = true;
      setRotation(Spindle, 0F, 0F, 0F);
      Axel = new ModelRenderer(this, 0, 0);
      Axel.addBox(0F, 0F, -15F, 1, 1, 27);
      Axel.setRotationPoint(8F, -60F, 8F);
      Axel.setTextureSize(64, 32);
      Axel.mirror = true;
      setRotation(Axel, 0F, 0F, 0F);
      Vane1 = new ModelRenderer(this, 0, 0);
      Vane1.addBox(0F, -1F, 12F, 1, 3, 2);
      Vane1.setRotationPoint(8F, -60F, 8F);
      Vane1.setTextureSize(64, 32);
      Vane1.mirror = true;
      setRotation(Vane1, 0F, 0F, 0F);
      Vane2 = new ModelRenderer(this, 0, 0);
      Vane2.addBox(0F, -2F, 14F, 1, 5, 3);
      Vane2.setRotationPoint(8F, -60F, 8F);
      Vane2.setTextureSize(64, 32);
      Vane2.mirror = true;
      setRotation(Vane2, 0F, 0F, 0F);
      Vane3 = new ModelRenderer(this, 0, 0);
      Vane3.addBox(0F, -3F, 17F, 1, 7, 5);
      Vane3.setRotationPoint(8F, -60F, 8F);
      Vane3.setTextureSize(64, 32);
      Vane3.mirror = true;
      setRotation(Vane3, 0F, 0F, 0F);
      Blade1Part1 = new ModelRenderer(this, 0, 0);
      Blade1Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade1Part1.setRotationPoint(9F, -60F, -8F);
      Blade1Part1.setTextureSize(64, 32);
      Blade1Part1.mirror = true;
      setRotation(Blade1Part1, -0.1745329F, 0F, 0F);
      Blade1Part2 = new ModelRenderer(this, 0, 0);
      Blade1Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade1Part2.setRotationPoint(9F, -60F, -8F);
      Blade1Part2.setTextureSize(64, 32);
      Blade1Part2.mirror = true;
      setRotation(Blade1Part2, -0.1745329F, 0F, 0F);
      Blade1Part3 = new ModelRenderer(this, 0, 0);
      Blade1Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade1Part3.setRotationPoint(9F, -60F, -8F);
      Blade1Part3.setTextureSize(64, 32);
      Blade1Part3.mirror = true;
      setRotation(Blade1Part3, -0.1745329F, 0F, 0F);
      Blade1Part4 = new ModelRenderer(this, 0, 0);
      Blade1Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade1Part4.setRotationPoint(9F, -60F, -8F);
      Blade1Part4.setTextureSize(64, 32);
      Blade1Part4.mirror = true;
      setRotation(Blade1Part4, -0.1745329F, 0F, 0F);
      Blade2Part1 = new ModelRenderer(this, 0, 0);
      Blade2Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade2Part1.setRotationPoint(9F, -60F, -8F);
      Blade2Part1.setTextureSize(64, 32);
      Blade2Part1.mirror = true;
      setRotation(Blade2Part1, -0.1745329F, 0F, -0.7853982F);
      Blade2Part2 = new ModelRenderer(this, 0, 0);
      Blade2Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade2Part2.setRotationPoint(9F, -60F, -8F);
      Blade2Part2.setTextureSize(64, 32);
      Blade2Part2.mirror = true;
      setRotation(Blade2Part2, -0.1745329F, 0F, -0.7853982F);
      Blade2Part3 = new ModelRenderer(this, 0, 0);
      Blade2Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade2Part3.setRotationPoint(9F, -60F, -8F);
      Blade2Part3.setTextureSize(64, 32);
      Blade2Part3.mirror = true;
      setRotation(Blade2Part3, -0.1745329F, 0F, -0.7853982F);
      Blade2Part4 = new ModelRenderer(this, 0, 0);
      Blade2Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade2Part4.setRotationPoint(9F, -60F, -8F);
      Blade2Part4.setTextureSize(64, 32);
      Blade2Part4.mirror = true;
      setRotation(Blade2Part4, -0.1745329F, 0F, -0.7853982F);
      Blade3Part1 = new ModelRenderer(this, 0, 0);
      Blade3Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade3Part1.setRotationPoint(9F, -60F, -8F);
      Blade3Part1.setTextureSize(64, 32);
      Blade3Part1.mirror = true;
      setRotation(Blade3Part1, -0.1745329F, 0F, -1.570796F);
      Blade3Part2 = new ModelRenderer(this, 0, 0);
      Blade3Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade3Part2.setRotationPoint(9F, -60F, -8F);
      Blade3Part2.setTextureSize(64, 32);
      Blade3Part2.mirror = true;
      setRotation(Blade3Part2, -0.1745329F, 0F, -1.570796F);
      Blade3Part3 = new ModelRenderer(this, 0, 0);
      Blade3Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade3Part3.setRotationPoint(9F, -60F, -8F);
      Blade3Part3.setTextureSize(64, 32);
      Blade3Part3.mirror = true;
      setRotation(Blade3Part3, -0.1745329F, 0F, -1.570796F);
      Blade3Part4 = new ModelRenderer(this, 0, 0);
      Blade3Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade3Part4.setRotationPoint(9F, -60F, -8F);
      Blade3Part4.setTextureSize(64, 32);
      Blade3Part4.mirror = true;
      setRotation(Blade3Part4, -0.1745329F, 0F, -1.570796F);
      Blade4Part1 = new ModelRenderer(this, 0, 0);
      Blade4Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade4Part1.setRotationPoint(9F, -60F, -8F);
      Blade4Part1.setTextureSize(64, 32);
      Blade4Part1.mirror = true;
      setRotation(Blade4Part1, -0.1745329F, 0F, -2.356194F);
      Blade4Part2 = new ModelRenderer(this, 0, 0);
      Blade4Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade4Part2.setRotationPoint(9F, -60F, -8F);
      Blade4Part2.setTextureSize(64, 32);
      Blade4Part2.mirror = true;
      setRotation(Blade4Part2, -0.1745329F, 0F, -2.356194F);
      Blade4Part3 = new ModelRenderer(this, 0, 0);
      Blade4Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade4Part3.setRotationPoint(9F, -60F, -8F);
      Blade4Part3.setTextureSize(64, 32);
      Blade4Part3.mirror = true;
      setRotation(Blade4Part3, -0.1745329F, 0F, -2.356194F);
      Blade4Part4 = new ModelRenderer(this, 0, 0);
      Blade4Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade4Part4.setRotationPoint(9F, -60F, -8F);
      Blade4Part4.setTextureSize(64, 32);
      Blade4Part4.mirror = true;
      setRotation(Blade4Part4, -0.1745329F, 0F, -2.356194F);
      Blade5Part1 = new ModelRenderer(this, 0, 0);
      Blade5Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade5Part1.setRotationPoint(9F, -60F, -8F);
      Blade5Part1.setTextureSize(64, 32);
      Blade5Part1.mirror = true;
      setRotation(Blade5Part1, -0.1745329F, 0F, -3.141593F);
      Blade5Part2 = new ModelRenderer(this, 0, 0);
      Blade5Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade5Part2.setRotationPoint(9F, -60F, -8F);
      Blade5Part2.setTextureSize(64, 32);
      Blade5Part2.mirror = true;
      setRotation(Blade5Part2, -0.1745329F, 0F, -3.141593F);
      Blade5Part3 = new ModelRenderer(this, 0, 0);
      Blade5Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade5Part3.setRotationPoint(9F, -60F, -8F);
      Blade5Part3.setTextureSize(64, 32);
      Blade5Part3.mirror = true;
      setRotation(Blade5Part3, -0.1745329F, 0F, -3.141593F);
      Blade5Part4 = new ModelRenderer(this, 0, 0);
      Blade5Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade5Part4.setRotationPoint(9F, -60F, -8F);
      Blade5Part4.setTextureSize(64, 32);
      Blade5Part4.mirror = true;
      setRotation(Blade5Part4, -0.1745329F, 0F, -3.141593F);
      Blade6Part1 = new ModelRenderer(this, 0, 0);
      Blade6Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade6Part1.setRotationPoint(9F, -60F, -8F);
      Blade6Part1.setTextureSize(64, 32);
      Blade6Part1.mirror = true;
      setRotation(Blade6Part1, -0.1745329F, 0F, 0.7853982F);
      Blade6Part2 = new ModelRenderer(this, 0, 0);
      Blade6Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade6Part2.setRotationPoint(9F, -60F, -8F);
      Blade6Part2.setTextureSize(64, 32);
      Blade6Part2.mirror = true;
      setRotation(Blade6Part2, -0.1745329F, 0F, 0.7853982F);
      Blade6Part3 = new ModelRenderer(this, 0, 0);
      Blade6Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade6Part3.setRotationPoint(9F, -60F, -8F);
      Blade6Part3.setTextureSize(64, 32);
      Blade6Part3.mirror = true;
      setRotation(Blade6Part3, -0.1745329F, 0F, 0.7853982F);
      Blade6Part4 = new ModelRenderer(this, 0, 0);
      Blade6Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade6Part4.setRotationPoint(9F, -60F, -8F);
      Blade6Part4.setTextureSize(64, 32);
      Blade6Part4.mirror = true;
      setRotation(Blade6Part4, -0.1745329F, 0F, 0.7853982F);
      Blade7Part1 = new ModelRenderer(this, 0, 0);
      Blade7Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade7Part1.setRotationPoint(9F, -60F, -8F);
      Blade7Part1.setTextureSize(64, 32);
      Blade7Part1.mirror = true;
      setRotation(Blade7Part1, -0.1745329F, 0F, 1.570796F);
      Blade7Part2 = new ModelRenderer(this, 0, 0);
      Blade7Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade7Part2.setRotationPoint(9F, -60F, -8F);
      Blade7Part2.setTextureSize(64, 32);
      Blade7Part2.mirror = true;
      setRotation(Blade7Part2, -0.1745329F, 0F, 1.570796F);
      Blade7Part3 = new ModelRenderer(this, 0, 0);
      Blade7Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade7Part3.setRotationPoint(9F, -60F, -8F);
      Blade7Part3.setTextureSize(64, 32);
      Blade7Part3.mirror = true;
      setRotation(Blade7Part3, -0.1745329F, 0F, 1.570796F);
      Blade7Part4 = new ModelRenderer(this, 0, 0);
      Blade7Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade7Part4.setRotationPoint(9F, -60F, -8F);
      Blade7Part4.setTextureSize(64, 32);
      Blade7Part4.mirror = true;
      setRotation(Blade7Part4, -0.1745329F, 0F, 1.570796F);
      Blade8Part1 = new ModelRenderer(this, 0, 0);
      Blade8Part1.addBox(0F, 0F, 0F, 4, 1, 1);
      Blade8Part1.setRotationPoint(9F, -60F, -8F);
      Blade8Part1.setTextureSize(64, 32);
      Blade8Part1.mirror = true;
      setRotation(Blade8Part1, -0.1745329F, 0F, 2.356194F);
      Blade8Part2 = new ModelRenderer(this, 0, 0);
      Blade8Part2.addBox(4F, -1F, 0F, 3, 3, 1);
      Blade8Part2.setRotationPoint(9F, -60F, -8F);
      Blade8Part2.setTextureSize(64, 32);
      Blade8Part2.mirror = true;
      setRotation(Blade8Part2, -0.1745329F, 0F, 2.356194F);
      Blade8Part3 = new ModelRenderer(this, 0, 0);
      Blade8Part3.addBox(7F, -2F, 0F, 4, 5, 1);
      Blade8Part3.setRotationPoint(9F, -60F, -8F);
      Blade8Part3.setTextureSize(64, 32);
      Blade8Part3.mirror = true;
      setRotation(Blade8Part3, -0.1745329F, 0F, 2.356194F);
      Blade8Part4 = new ModelRenderer(this, 0, 0);
      Blade8Part4.addBox(11F, -3F, 0F, 10, 7, 1);
      Blade8Part4.setRotationPoint(9F, -60F, -8F);
      Blade8Part4.setTextureSize(64, 32);
      Blade8Part4.mirror = true;
      setRotation(Blade8Part4, -0.1745329F, 0F, 2.356194F);
      Cross1 = new ModelRenderer(this, 64, 0);
      Cross1.addBox(-10F, 0F, -11F, 20, 2, 1);
      Cross1.setRotationPoint(8F, -29F, 8F);
      Cross1.setTextureSize(64, 32);
      Cross1.mirror = true;
      setRotation(Cross1, 0F, 0F, 0F);
      Cross2 = new ModelRenderer(this, 69, 0);
      Cross2.addBox(-14F, 39F, -15F, 28, 2, 1);
      Cross2.setRotationPoint(8F, -29F, 8F);
      Cross2.setTextureSize(64, 32);
      Cross2.mirror = true;
      setRotation(Cross2, 0F, 0F, 0F);
      Cross3 = new ModelRenderer(this, 64, 0);
      Cross3.addBox(-10F, 0F, 10F, 20, 2, 1);
      Cross3.setRotationPoint(8F, -29F, 8F);
      Cross3.setTextureSize(64, 32);
      Cross3.mirror = true;
      setRotation(Cross3, 0F, 0F, 0F);
      Cross4 = new ModelRenderer(this, 69, 0);
      Cross4.addBox(-14F, 39F, 14F, 28, 2, 1);
      Cross4.setRotationPoint(8F, -29F, 8F);
      Cross4.setTextureSize(64, 32);
      Cross4.mirror = true;
      setRotation(Cross4, 0F, 0F, 0F);
      Cross6 = new ModelRenderer(this, 64, 0);
      Cross6.addBox(10F, 0F, -10F, 1, 2, 20);
      Cross6.setRotationPoint(8F, -29F, 8F);
      Cross6.setTextureSize(64, 32);
      Cross6.mirror = true;
      setRotation(Cross6, 0F, 0F, 0F);
      Cross7 = new ModelRenderer(this, 69, 0);
      Cross7.addBox(14F, 39F, -14F, 1, 2, 28);
      Cross7.setRotationPoint(8F, -29F, 8F);
      Cross7.setTextureSize(64, 32);
      Cross7.mirror = true;
      setRotation(Cross7, 0F, 0F, 0F);
      Cross8 = new ModelRenderer(this, 64, 0);
      Cross8.addBox(-11F, 0F, -10F, 1, 2, 20);
      Cross8.setRotationPoint(8F, -29F, 8F);
      Cross8.setTextureSize(64, 32);
      Cross8.mirror = true;
      setRotation(Cross8, 0F, 0F, 0F);
      Cross9 = new ModelRenderer(this, 69, 0);
      Cross9.addBox(-15F, 39F, -14F, 1, 2, 28);
      Cross9.setRotationPoint(8F, -29F, 8F);
      Cross9.setTextureSize(64, 32);
      Cross9.mirror = true;
      setRotation(Cross9, 0F, 0F, 0F);
      Cross10 = new ModelRenderer(this, 37, 37);
      Cross10.addBox(-2F, 7F, -12F, 44, 2, 1); // move back one from -13 to -12
      Cross10.setRotationPoint(8F, -29F, 8F);
      Cross10.setTextureSize(64, 32);
      Cross10.mirror = true;
      setRotation(Cross10, 0F, 0.0872664626F, 1.012291F); // rotated from 9deg to 5deg
      Cross11 = new ModelRenderer(this, 67, 0);
      Cross11.addBox(-24F, -11F, -9F, 29, 2, 1);
      Cross11.setRotationPoint(8F, -29F, 8F);
      Cross11.setTextureSize(64, 32);
      Cross11.mirror = true;
      setRotation(Cross11, 0F, 0.1570796F, 1.012291F);
      Cross12 = new ModelRenderer(this, 37, 37);
      Cross12.addBox(-2F, 6F, 11F, 44, 2, 1); // moved back one from 12 to 11
      Cross12.setRotationPoint(8F, -29F, 8F);
      Cross12.setTextureSize(64, 32);
      Cross12.mirror = true;
      setRotation(Cross12, 0F, -0.0872664626F, 1.012291F); // rotated from -9deg to -5deg
      Cross13 = new ModelRenderer(this, 67, 0);
      Cross13.addBox(-25F, -10F, 8F, 29, 2, 1);
      Cross13.setRotationPoint(8F, -29F, 8F);
      Cross13.setTextureSize(64, 32);
      Cross13.mirror = true;
      setRotation(Cross13, 0F, -0.1570796F, 1.012291F);
      Cross14 = new ModelRenderer(this, 37, 37);
      Cross14.addBox(-42F, 7F, -12F, 44, 2, 1); // move back one from -13 to -14
      Cross14.setRotationPoint(8F, -29F, 8F);
      Cross14.setTextureSize(64, 32);
      Cross14.mirror = true;
      setRotation(Cross14, 0F, -0.0872664626F, -1.012291F); // rotated from -9deg to -5deg
      Cross15 = new ModelRenderer(this, 67, 0);
      Cross15.addBox(-4F, -10F, -9F, 29, 2, 1);
      Cross15.setRotationPoint(8F, -29F, 8F);
      Cross15.setTextureSize(64, 32);
      Cross15.mirror = true;
      setRotation(Cross15, 0F, -0.1570796F, -1.012291F);
      Cross16 = new ModelRenderer(this, 67, 0);
      Cross16.addBox(-4F, -11F, 8F, 29, 2, 1);
      Cross16.setRotationPoint(8F, -29F, 8F);
      Cross16.setTextureSize(64, 32);
      Cross16.mirror = true;
      setRotation(Cross16, 0F, 0.1570796F, -1.012291F);
      Cross17 = new ModelRenderer(this, 37, 37);
      Cross17.addBox(-42F, 7F, 11F, 44, 2, 1); // move back one from 12 to 11
      Cross17.setRotationPoint(8F, -29F, 8F);
      Cross17.setTextureSize(64, 32);
      Cross17.mirror = true;
      setRotation(Cross17, 0F, 0.0872664626F, -1.012291F); // rotated from 9deg to 5deg
      Cross18 = new ModelRenderer(this, 37, 37);
      Cross18.addBox(12F, 8F, -42F, 1, 2, 44);
      Cross18.setRotationPoint(8F, -29F, 8F);
      Cross18.setTextureSize(64, 32);
      Cross18.mirror = true;
      setRotation(Cross18, 1.012291F, -0.1570796F, 0F);
      Cross19 = new ModelRenderer(this, 37, 37);
      Cross19.addBox(12F, 6F, -3F, 1, 2, 44);
      Cross19.setRotationPoint(8F, -29F, 8F);
      Cross19.setTextureSize(64, 32);
      Cross19.mirror = true;
      setRotation(Cross19, -1.012291F, 0.1570796F, 0F);
      Cross20 = new ModelRenderer(this, 37, 37);
      Cross20.addBox(-13F, 6F, -41F, 1, 2, 44);
      Cross20.setRotationPoint(8F, -29F, 8F);
      Cross20.setTextureSize(64, 32);
      Cross20.mirror = true;
      setRotation(Cross20, 1.012291F, 0.1570796F, 0F);
      Cross21 = new ModelRenderer(this, 37, 37);
      Cross21.addBox(-13F, 7F, -2F, 1, 2, 44);
      Cross21.setRotationPoint(8F, -29F, 8F);
      Cross21.setTextureSize(64, 32);
      Cross21.mirror = true;
      setRotation(Cross21, -1.012291F, -0.1570796F, 0F);
      Cross22 = new ModelRenderer(this, 67, 0);
      Cross22.addBox(-9F, -10F, -25F, 1, 2, 29);
      Cross22.setRotationPoint(8F, -29F, 8F);
      Cross22.setTextureSize(64, 32);
      Cross22.mirror = true;
      setRotation(Cross22, -1.012291F, -0.1570796F, 0F);
      Cross23 = new ModelRenderer(this, 67, 0);
      Cross23.addBox(-9F, -11F, -4F, 1, 2, 29);
      Cross23.setRotationPoint(8F, -29F, 8F);
      Cross23.setTextureSize(64, 32);
      Cross23.mirror = true;
      setRotation(Cross23, 1.012291F, 0.1570796F, 0F);
      Cross24 = new ModelRenderer(this, 67, 0);
      Cross24.addBox(8F, -11F, -25F, 1, 2, 29);
      Cross24.setRotationPoint(8F, -29F, 8F);
      Cross24.setTextureSize(64, 32);
      Cross24.mirror = true;
      setRotation(Cross24, -1.012291F, 0.1570796F, 0F);
      Cross25 = new ModelRenderer(this, 67, 0);
      Cross25.addBox(8F, -11F, -4F, 1, 2, 29);
      Cross25.setRotationPoint(8F, -29F, 8F);
      Cross25.setTextureSize(64, 32);
      Cross25.mirror = true;
      setRotation(Cross25, 1.012291F, -0.1570796F, 0F);
    Tower = new ModelRenderer(this, "Tower");
    Tower.setRotationPoint(8F, -29F, 8F);
    setRotation(Tower, 0F, 0F, 0F);
    Tower.mirror = true;
    Head = new ModelRenderer(this, "Head");
    Head.setRotationPoint(8F, -60F, 8F);
    setRotation(Head, 0F, 0F, 0F);
    Head.mirror = true;
    Wheel = new ModelRenderer(this, "Wheel");
    Wheel.setRotationPoint(9F, -60F, -8F);
    setRotation(Wheel, 0F, 0F, 0F);
    Wheel.mirror = true;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Platform.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Spindle.render(f5);
    Axel.render(f5);
    Vane1.render(f5);
    Vane2.render(f5);
    Vane3.render(f5);
    Blade1Part1.render(f5);
    Blade1Part2.render(f5);
    Blade1Part3.render(f5);
    Blade1Part4.render(f5);
    Blade2Part1.render(f5);
    Blade2Part2.render(f5);
    Blade2Part3.render(f5);
    Blade2Part4.render(f5);
    Blade3Part1.render(f5);
    Blade3Part2.render(f5);
    Blade3Part3.render(f5);
    Blade3Part4.render(f5);
    Blade4Part1.render(f5);
    Blade4Part2.render(f5);
    Blade4Part3.render(f5);
    Blade4Part4.render(f5);
    Blade5Part1.render(f5);
    Blade5Part2.render(f5);
    Blade5Part3.render(f5);
    Blade5Part4.render(f5);
    Blade6Part1.render(f5);
    Blade6Part2.render(f5);
    Blade6Part3.render(f5);
    Blade6Part4.render(f5);
    Blade7Part1.render(f5);
    Blade7Part2.render(f5);
    Blade7Part3.render(f5);
    Blade7Part4.render(f5);
    Blade8Part1.render(f5);
    Blade8Part2.render(f5);
    Blade8Part3.render(f5);
    Blade8Part4.render(f5);
    Cross1.render(f5);
    Cross2.render(f5);
    Cross3.render(f5);
    Cross4.render(f5);
    Cross6.render(f5);
    Cross7.render(f5);
    Cross8.render(f5);
    Cross9.render(f5);
    Cross10.render(f5);
    Cross11.render(f5);
    Cross12.render(f5);
    Cross13.render(f5);
    Cross14.render(f5);
    Cross15.render(f5);
    Cross16.render(f5);
    Cross17.render(f5);
    Cross18.render(f5);
    Cross19.render(f5);
    Cross20.render(f5);
    Cross21.render(f5);
    Cross22.render(f5);
    Cross23.render(f5);
    Cross24.render(f5);
    Cross25.render(f5);
    Tower.render(f5);
    Head.render(f5);
    Wheel.render(f5);
  }
  
        public void renderModel(float f5) {
            Platform.render(f5);
            Leg1.render(f5);
            Leg2.render(f5);
            Leg3.render(f5);
            Leg4.render(f5);
            Spindle.render(f5);
            Axel.render(f5);
            Vane1.render(f5);
            Vane2.render(f5);
            Vane3.render(f5);
            Blade1Part1.render(f5);
            Blade1Part2.render(f5);
            Blade1Part3.render(f5);
            Blade1Part4.render(f5);
            Blade2Part1.render(f5);
            Blade2Part2.render(f5);
            Blade2Part3.render(f5);
            Blade2Part4.render(f5);
            Blade3Part1.render(f5);
            Blade3Part2.render(f5);
            Blade3Part3.render(f5);
            Blade3Part4.render(f5);
            Blade4Part1.render(f5);
            Blade4Part2.render(f5);
            Blade4Part3.render(f5);
            Blade4Part4.render(f5);
            Blade5Part1.render(f5);
            Blade5Part2.render(f5);
            Blade5Part3.render(f5);
            Blade5Part4.render(f5);
            Blade6Part1.render(f5);
            Blade6Part2.render(f5);
            Blade6Part3.render(f5);
            Blade6Part4.render(f5);
            Blade7Part1.render(f5);
            Blade7Part2.render(f5);
            Blade7Part3.render(f5);
            Blade7Part4.render(f5);
            Blade8Part1.render(f5);
            Blade8Part2.render(f5);
            Blade8Part3.render(f5);
            Blade8Part4.render(f5);
            Cross1.render(f5);
            Cross2.render(f5);
            Cross3.render(f5);
            Cross4.render(f5);
            Cross6.render(f5);
            Cross7.render(f5);
            Cross8.render(f5);
            Cross9.render(f5);
            Cross10.render(f5);
            Cross11.render(f5);
            Cross12.render(f5);
            Cross13.render(f5);
            Cross14.render(f5);
            Cross15.render(f5);
            Cross16.render(f5);
            Cross17.render(f5);
            Cross18.render(f5);
            Cross19.render(f5);
            Cross20.render(f5);
            Cross21.render(f5);
            Cross22.render(f5);
            Cross23.render(f5);
            Cross24.render(f5);
            Cross25.render(f5);
            Tower.render(f5);
            Head.render(f5);
            Wheel.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
