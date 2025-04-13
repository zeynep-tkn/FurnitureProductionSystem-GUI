package com.abstractfactory.factory;

import com.abstractfactory.furniture.*;

	public class ArtDecoFurnitureFactory extends AbstractFurnitureFactory{
		@Override
	    public Chair createChair() {
	        return new ArtDecoChair();
	    }

	    @Override
	    public Sofa createSofa() {
	        return new ArtDecoSofa();
	    }

	    @Override
	    public CoffeeTable createCoffeeTable() {
	        return new ArtDecoCoffeeTable();
	    }
		
	}
