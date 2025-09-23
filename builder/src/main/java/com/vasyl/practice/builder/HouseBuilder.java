package com.vasyl.practice.builder;

import com.vasyl.practice.pojo.House;

//    protected int floors;
//    protected int rooms;
//    protected int windows;
//    protected String material;
//    protected boolean hasGarage;
//    protected boolean hasGarden;
//    protected boolean hasSwimmingPool;
public interface HouseBuilder {

    HouseBuilder floors(int floors);
    HouseBuilder rooms(int rooms);
    HouseBuilder windows(int windows);
    HouseBuilder material(String material);
    HouseBuilder hasGarage(boolean hasGarage);
    HouseBuilder hasGarden(boolean hasGarden);
    HouseBuilder hasSwimmingPool(boolean hasSwimmingPool);

    void reset();

    House build();
}
