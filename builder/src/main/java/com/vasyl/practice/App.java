package com.vasyl.practice;

import com.vasyl.practice.builder.HouseBuilder;
import com.vasyl.practice.builder.impl.HouseBuilderImpl;
import com.vasyl.practice.director.HouseBuilderDirector;
import com.vasyl.practice.pojo.House;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilderImpl();
        HouseBuilderDirector director = new HouseBuilderDirector(houseBuilder);

        House skyscraper = director.buildSkyscraper();
        House standartHouse = director.buildStandartHouse();
        House penthouse = director.buildPenthouse();

        System.out.println(skyscraper);
        System.out.println(standartHouse);
        System.out.println(penthouse);
    }
}
