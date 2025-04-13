package com.abstractfactory.furniture;

public class ModernCoffeeTable extends CoffeeTable {
 @Override 
 public void render() {
	 System.out.println("Modern CoffeeTable rendered.");
 }
 @Override 
 public Furniture clone() {
	 return new ModernCoffeeTable();
 }
}
