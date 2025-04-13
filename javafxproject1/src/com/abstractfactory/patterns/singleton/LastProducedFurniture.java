package com.abstractfactory.patterns.singleton;

import com.abstractfactory.furniture.Furniture;

public class LastProducedFurniture {

    private static LastProducedFurniture instance;
    private Furniture furniture;

    private LastProducedFurniture() {
        // private constructor
    }

    public static LastProducedFurniture getInstance() {
        if (instance == null) {
            instance = new LastProducedFurniture();
        }
        return instance;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
