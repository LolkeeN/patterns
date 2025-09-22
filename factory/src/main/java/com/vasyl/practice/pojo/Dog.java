package com.vasyl.practice.pojo;

public class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
