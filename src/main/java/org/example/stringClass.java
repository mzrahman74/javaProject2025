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
    public static void method_06() {
        String txt = "Hello\rWorld";
        System.out.println(txt);
    }


    public static void method_05() {
        Scanner sc = new Scanner(System.in);
    System.out.println("Please enter string:\r");
    String txt = sc.nextLine();
    }
    public static void method_07() {
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        int characters = words.chars().sum();
    System.out.println(characters);
    }
    public static void method_08() {
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
    System.out.println(myArray[0]);

    for (char i: myArray) {
      System.out.println(i);
    }
    for ( int j = 0; j< myArray.length; j++) {
      System.out.println( j + ":" + myArray[j]);
    }
    }
    public static void main(String[] args){
        method_10();
    }
    public static void method_09() {
        String testName = "Yusuf Rahman";
        char[] myArray = testName.toCharArray();
    System.out.println(myArray[0]);
    for (char i: myArray) {
      System.out.println(i);
    }
    for (int j =0; j< myArray.length; j++) {
      System.out.println(j + ":" + myArray[j]);
    }
    }
    public static void method_10() {
        String  names = "Technology";
        char [] arrayNames = names.toCharArray();
    System.out.println(arrayNames[0]);
    for(char i : arrayNames) {
      System.out.println(i);
    }
    for(int j=0; j<arrayNames.length; j++) {
      System.out.println(j + ":" + arrayNames[j]);
    }
    }
}
