package org.example;

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
}
