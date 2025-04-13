package com.abstractfactory.factory;

import com.abstractfactory.furniture.*;
public class VictorianFurnitureFactory extends AbstractFurnitureFactory{
 
	 @Override
	    public Chair createChair() {
	        return new VictorianChair();
	    }

	    @Override
	    public Sofa createSofa() {
	        return new VictorianSofa();
	    }

	    @Override
	    public CoffeeTable createCoffeeTable() {
	        return new VictorianCoffeeTable();
	    }
	
}
