package com.vasyl.practice;

public final class SingleBingle {

    private final String name;
    private final int age;

    private static SingleBingle instance;

    public SingleBingle(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static SingleBingle getInstance() {
        if (instance == null) {
            synchronized (SingleBingle.class) {
                if (instance == null) {
                    instance = new SingleBingle(25, "Vasyl");
                }
            }
        }

        return instance;
    }
}
