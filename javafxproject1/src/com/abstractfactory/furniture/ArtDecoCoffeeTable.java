package com.abstractfactory.furniture;

public class ArtDecoCoffeeTable extends CoffeeTable {
   @Override
   public void render() {
	   System.out.println("ArtDeco tarzında bir masa üretildi.");
   }
   
   @Override 
   public Furniture clone() {
	   return new ArtDecoCoffeeTable();
   }
   
}
