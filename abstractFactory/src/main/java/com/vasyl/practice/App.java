package com.vasyl.practice;

import com.vasyl.practice.factory.AbstractFactory;
import com.vasyl.practice.factory.ClothFactory;
import com.vasyl.practice.factory.StoneFactory;
import com.vasyl.practice.factory.WoodenFactory;
import com.vasyl.practice.pojo.Chair;
import com.vasyl.practice.pojo.Sofa;
import com.vasyl.practice.pojo.Table;
import com.vasyl.practice.pojo.cloth.ClothSofa;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        AbstractFactory factory;
        Random random = new Random();
        int rand = random.nextInt(4);

        switch (rand) {
            case 0: factory = new ClothFactory(); break;
            case 1: factory = new WoodenFactory(); break;
            case 2: factory = new StoneFactory(); break;
            default:
                System.out.println("Wrong number");
                return;
        }

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        Table table = factory.createTable();

        System.out.println();
    }
}
