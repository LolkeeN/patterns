package com.vasyl.practice.builder.impl;

import com.vasyl.practice.builder.HouseBuilder;
import com.vasyl.practice.pojo.House;

public class HouseBuilderImpl implements HouseBuilder {

    private House house;

    public HouseBuilderImpl() {
        this.house = new House();
    }

    @Override
    public House build() {
        return house;
    }

    @Override
    public HouseBuilderImpl floors(int floors) {
        this.house.setFloors(floors);

        return this;
    }

    @Override
    public HouseBuilderImpl rooms(int rooms) {
        this.house.setRooms(rooms);

        return this;
    }

    @Override
    public HouseBuilderImpl windows(int windows) {
        this.house.setWindows(windows);

        return this;
    }

    @Override
    public HouseBuilderImpl material(String material) {
        this.house.setMaterial(material);

        return this;
    }

    @Override
    public HouseBuilderImpl hasGarage(boolean hasGarage) {
        this.house.setHasGarage(hasGarage);

        return this;
    }

    @Override
    public HouseBuilderImpl hasGarden(boolean hasGarden) {
        this.house.setHasGarden(hasGarden);

        return this;
    }

    @Override
    public HouseBuilderImpl hasSwimmingPool(boolean hasSwimmingPool) {
        this.house.setHasSwimmingPool(hasSwimmingPool);

        return this;
    }

    @Override
    public void reset() {
        this.house = new House();
    }
}
