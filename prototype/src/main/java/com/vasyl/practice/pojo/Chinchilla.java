package com.vasyl.practice.pojo;

import com.vasyl.practice.Prototype;

public class Chinchilla implements Prototype<Chinchilla> {

    public Chinchilla(Chinchilla prototype) {
        this.age = prototype.age;
        this.furColor = prototype.furColor;
        this.name = prototype.name;
        this.tailLength = prototype.tailLength;
        this.weight = prototype.weight;
    }

    public Chinchilla(int age, String furColor, String name, double tailLength, double weight) {
        this.age = age;
        this.furColor = furColor;
        this.name = name;
        this.tailLength = tailLength;
        this.weight = weight;
    }

    private String name;
    private String furColor;
    private int age;
    private double weight;
    private double tailLength;

    @Override
    public Chinchilla clone() {
        return new Chinchilla(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
