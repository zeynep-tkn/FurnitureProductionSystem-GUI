package com.abstractfactory.furniture;

public class ModernChair extends Chair {
	 @Override
	public void render() {
		 System.out.println("Modern tarzda bir sandalye üretildi.");
	}
	 @Override
	    public Furniture clone() {
	        return new ModernChair();
	    }

}
