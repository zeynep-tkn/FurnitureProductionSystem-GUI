package com.abstractfactory.furniture;

public class ArtDecoChair extends Chair {
   @Override
   public void render() {
	   System.out.println("ArtDeco tarzında bir sandalye üretildi.");
   }
   
   @Override 
   public Furniture clone() {
	   return new ArtDecoChair();
   }
   
}
