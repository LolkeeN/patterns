package com.vasyl.practice;

import com.vasyl.practice.pojo.Chinchilla;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Chinchilla oneChinchilla = new Chinchilla(2, "Gray", "Vasyl", 12.2, 50.0);
        Chinchilla cloneChinchilla = oneChinchilla.clone();

        boolean equals = oneChinchilla.equals(cloneChinchilla);
        System.out.println(equals);

        System.out.println("Fur equal: " + (Objects.equals(oneChinchilla.getFurColor(), cloneChinchilla.getFurColor())));
        System.out.println("Age equal: " + (Objects.equals(oneChinchilla.getAge(), cloneChinchilla.getAge())));
        System.out.println("Name equal: " + (Objects.equals(oneChinchilla.getName(), cloneChinchilla.getName())));
        System.out.println("Weight equal: " + (Objects.equals(oneChinchilla.getWeight(), cloneChinchilla.getWeight())));
        System.out.println("Tail length equal: " + (Objects.equals(oneChinchilla.getTailLength(), cloneChinchilla.getTailLength())));
    }
}
