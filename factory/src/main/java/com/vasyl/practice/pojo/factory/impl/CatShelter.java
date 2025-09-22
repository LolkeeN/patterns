package com.vasyl.practice.pojo.factory.impl;

import com.vasyl.practice.pojo.Animal;
import com.vasyl.practice.pojo.Cat;
import com.vasyl.practice.pojo.factory.Shelter;

public class CatShelter extends Shelter {

    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
