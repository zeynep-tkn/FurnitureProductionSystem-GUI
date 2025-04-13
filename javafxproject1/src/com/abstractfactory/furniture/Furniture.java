package com.abstractfactory.furniture;

public abstract class Furniture implements Cloneable {
    public abstract void render();

    @Override
    public Furniture clone() {
        try {
            return (Furniture) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
