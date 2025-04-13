package com.abstractfactory.manager;

import com.abstractfactory.factory.*;
import com.abstractfactory.furniture.*;

public class FurnitureManager {

    private static FurnitureManager instance;
    private AbstractFurnitureFactory factory;
    private FurnitureManager() {
        // Varsayılan fabrika
        factory = new ModernFurnitureFactory();
    }

    public static FurnitureManager getInstance() {
        if (instance == null) {
            instance = new FurnitureManager();
        }
        return instance;
    }

    public void setFactory(String style) {
        switch (style.toLowerCase()) {
            case "modern":
                factory = new ModernFurnitureFactory();
                break;
            case "art deco":
                factory = new ArtDecoFurnitureFactory();
                break;
            case "victorian":
                factory = new VictorianFurnitureFactory();
                break;
            default:
                factory = new ModernFurnitureFactory();
                break;
        }
    }

    public Furniture createFurniture(String type) {
        return switch (type.toLowerCase()) {
            case "chair" -> factory.createChair();
            case "sofa" -> factory.createSofa();
            case "coffee table" -> factory.createCoffeeTable();
            default -> null;
        };
    }
}
