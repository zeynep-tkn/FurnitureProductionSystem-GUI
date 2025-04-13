package com.abstractfactory.furniture;

public class VictorianCoffeeTable extends CoffeeTable {

    @Override
    public void render() {
        System.out.println("Victorian CoffeeTable rendered.");
    }

    @Override
    public Furniture clone() {
        return new VictorianCoffeeTable();
    }
}