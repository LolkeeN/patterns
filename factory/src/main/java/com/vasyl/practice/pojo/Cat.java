package com.vasyl.practice.pojo;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
