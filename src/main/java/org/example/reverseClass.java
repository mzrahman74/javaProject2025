package org.example;

import java.util.Scanner;

public class reverseClass {
  public static void method_01() {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String userName = myObj.nextLine();
    System.out.println("username is: " + userName);
  }

  public static void method_02() {
    Scanner obj = new Scanner(System.in);
    System.out.println("please enter string:\r");
    String name = obj.nextLine();
    String reversed = "";

    for (int i = 0; i < name.length(); i++) {

      reversed = name.charAt(i) + reversed;
    }
    System.out.println("Reversed string: " + reversed);
  }

  public static void method_03() {
    String words = "One Two Three Four";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
  }

  public static void method_04() {
    String original = "Hello, World!";
    String reversed = "";
    for (int i = original.length() - 1; i >= 0; i--) {
      reversed += original.charAt(i);
    }
    System.out.println("Reversed: " + reversed);
  }

  public static void method_05() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter string: \r");
    String name = sc.nextLine();
    String reversed = new StringBuilder(name).reverse().toString();
    System.out.println(reversed);
  }

  public static void method_06() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the string: \r");
    String name = scanner.nextLine();
    String reversed = new StringBuilder(name).reverse().toString();
    System.out.println(reversed);
  }

  public static void method_07() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the string: \r");
    String name = scanner.nextLine();
    String reversed = new StringBuilder(name).reverse().toString();
    System.out.println(reversed);
  }
}
