package com.vasyl.practice.pojo;

public abstract class Table implements Furniture {

    @Override
    public boolean isSoft() {
        return false;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
