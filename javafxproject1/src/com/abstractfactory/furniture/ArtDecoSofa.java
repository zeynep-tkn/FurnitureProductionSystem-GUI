package com.abstractfactory.furniture;

public class ArtDecoSofa extends Sofa {

    @Override
    public void render() {
        System.out.println("ArtDeco Sofa rendered.");
    }

    @Override
    public Furniture clone() {
        return new ArtDecoSofa();
    }
}