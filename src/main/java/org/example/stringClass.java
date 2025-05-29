package org.example;

import java.util.Scanner;

public class stringClass {
    public static void method_01() {
        String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    }
    public static void method_02() {
        String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
    }
    public static void method_03() {
        String x = "10";
        int y = 20;
        String z = x + y;
    System.out.println(z);
    }
    public static void method_04() {
        String txt = "Hello\nWorld";
    System.out.println(txt);
    }
    public static void method_05() {
        Scanner sc = new Scanner(System.in);
    System.out.println("Please enter string:\r");
    String txt = sc.nextLine();
    }
}
