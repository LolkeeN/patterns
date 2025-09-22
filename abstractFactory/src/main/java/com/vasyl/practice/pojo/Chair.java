package com.vasyl.practice.pojo;

public abstract class Chair implements Furniture {

    @Override
    public boolean isSoft() {
        return false;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
