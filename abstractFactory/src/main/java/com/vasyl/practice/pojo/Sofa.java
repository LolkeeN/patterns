package com.vasyl.practice.pojo;

public abstract class Sofa implements Furniture {

    @Override
    public boolean isSoft() {
        return true;
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
