package org.example;

import java.util.Arrays;

public class mathClass {
    public static void method_01() {
    System.out.println(Math.max(5, 10));
    System.out.println(Math.min(5, 10));
    System.out.println(Math.sqrt(64));
    System.out.println(Math.abs(-4.7));
    }

    public static void method_02() {
    System.out.println(Math.random());
    int num = (int) (Math.random() * 10 + 1);
    String [] colors = {"Red", "Green", "Blue", "Yellow"};
    int index = (int) (Math.random() * colors.length);
        System.out.println("Random number: " + num);
    System.out.println("Random color: " + colors[index]);
    }

  public static void method_03() {
    int number = (int) (Math.random() * 4 + 1);
    String[] names = {"Mohammad", "Nusrat", "Naushin", "Nuhaa", "Yusuf"};
    int index = (int) (Math.random() * names.length);
    System.out.println("Random number: " + number);
    System.out.println("Random names: " + names[index]);
    }
    public static void main(String[] args){
        method_03();
    }
}
