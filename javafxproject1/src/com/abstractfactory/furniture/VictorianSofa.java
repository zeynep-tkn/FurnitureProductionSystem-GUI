package com.abstractfactory.furniture;

public class VictorianSofa extends Sofa{
	 @Override 
	 public void render() {
		 System.out.println("Victorian Sofa rendered.");
	 }
	 @Override 
	 public Furniture clone() {
		 return new VictorianSofa();
	 }
	}
