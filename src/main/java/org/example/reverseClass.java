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

        for(int i= 0; i< name.length(); i++) {

            reversed = name.charAt(i) + reversed;
        }
        System.out.println("Reversed string: " + reversed);
    }

    public static void method_03() {
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
    System.out.println(countWords);
    }
}
