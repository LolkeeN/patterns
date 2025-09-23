package com.vasyl.practice.director;

import com.vasyl.practice.builder.HouseBuilder;
import com.vasyl.practice.builder.impl.HouseBuilderImpl;
import com.vasyl.practice.pojo.House;

public class HouseBuilderDirector {

    private final HouseBuilder houseBuilder;


    public HouseBuilderDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildStandartHouse() {
        houseBuilder.reset();

        return houseBuilder
                .floors(2)
                .windows(8)
                .hasSwimmingPool(false)
                .material("brick")
                .rooms(3)
                .build();
    }

    public House buildSkyscraper() {
        houseBuilder.reset();

        return houseBuilder
                .floors(123)
                .windows(500)
                .hasSwimmingPool(false)
                .material("metal and glass")
                .rooms(300)
                .hasGarage(true)
                .build();
    }

    public House buildPenthouse() {
        houseBuilder.reset();

        return houseBuilder
                .floors(50)
                .windows(200)
                .hasSwimmingPool(true)
                .material("metal and glass")
                .rooms(100)
                .hasGarage(false)
                .build();
    }
}
