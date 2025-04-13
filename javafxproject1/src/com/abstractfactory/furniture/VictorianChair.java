package com.abstractfactory.furniture;

public class VictorianChair extends Chair {
   @Override 
   public void render() {
	   System.out.println("Victorian Chair rendered.");
   }
   
   @Override 
   public Furniture clone() {
	   return new VictorianChair();
   }
}
