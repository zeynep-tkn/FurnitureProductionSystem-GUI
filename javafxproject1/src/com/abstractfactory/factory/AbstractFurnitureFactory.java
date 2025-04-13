package com.abstractfactory.factory;

import com.abstractfactory.furniture.*;

public abstract class AbstractFurnitureFactory {
    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract CoffeeTable createCoffeeTable();
}