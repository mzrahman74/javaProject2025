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
  public static void method_08() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number: \r");
    int number = scanner.nextInt();
    int reversed =0;
    while (number !=0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number /=10;
    }
    System.out.println("Reversed: " + reversed);
  }
  public static void method_09() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number: \r");
    int number = scanner.nextInt();
    int original = number;
    int result = 0;
    int digits = String.valueOf(number).length();

    while (number !=0) {
      int digit = number % 10;
      result += Math.pow(digit, digits);
      number /= 10;
    }
    System.out.println(original + (result == original ? "is Armstrong" :  " is not Armstrong"));
  }

  public static void method_10() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the string: \r");
    String name = scanner.nextLine();
    String reversed = new StringBuilder(name).reverse().toString();
    System.out.println(reversed);
  }

  public static void method_11() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number: \r");
    String name = scanner.nextLine();
    String reversed = new StringBuilder(name).reverse().toString();
    System.out.println(reversed);
  }
  public static void main(String[] args){
    method_13();
  }
  public static void method_12() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the name: \r");
    int number = scanner.nextInt();
    int reversed = 0;
    while (number !=0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number/=10;

    }
    System.out.println("Reversed: " + reversed);
  }
  public static void method_13() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter string: \r");
    String str = scanner.nextLine();
    String reversed = "";
    for(int i=0; i<str.length(); i++) {

      reversed = str.charAt(i) + reversed;
    }
    System.out.println("reversed string: " + reversed);
  }
}
