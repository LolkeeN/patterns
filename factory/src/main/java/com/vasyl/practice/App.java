package com.vasyl.practice;

import com.vasyl.practice.pojo.Animal;
import com.vasyl.practice.pojo.factory.Shelter;
import com.vasyl.practice.pojo.factory.impl.CatShelter;
import com.vasyl.practice.pojo.factory.impl.DogShelter;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Shelter shelter;
        Random random = new Random();
        boolean isCatShelter = random.nextBoolean();

        if (isCatShelter) {
            shelter = new CatShelter();
        } else {
            shelter = new DogShelter();
        }

        Animal animal = shelter.getAnimal();
        animal.speak();
        animal.eat();
    }
}
