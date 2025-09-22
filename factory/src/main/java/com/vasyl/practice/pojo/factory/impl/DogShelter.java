package com.vasyl.practice.pojo.factory.impl;

import com.vasyl.practice.pojo.Animal;
import com.vasyl.practice.pojo.Dog;
import com.vasyl.practice.pojo.factory.Shelter;

public class DogShelter extends Shelter {

    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
