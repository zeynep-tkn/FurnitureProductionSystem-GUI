package com.abstractfactory.furniture;

public class ModernSofa extends Sofa {
	 @Override 
	 public void render() {
		 System.out.println("Modern Sofa rendered.");
	 }
	 @Override 
	 public Furniture clone() {
		 return new ModernSofa();
	 }
	}
