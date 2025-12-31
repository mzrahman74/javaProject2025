package org.example;

import java.util.Scanner;

public class palinDromClass {
    public static void main(String[] args){
     System.out.println("Mohamamd" + " is palindrome: "  + method_one("Mohammad"));
    System.out.println( method_two("mohammad"));
    System.out.println(method_four());

    }

    public static boolean method() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter string: \r");
    String str = scanner.nextLine();
    String reverse = new StringBuilder(str).reverse().toString();
    return str.equals(reverse);
  }

  public static boolean method_one(String s) {
        String original = s.toLowerCase();
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);

  }
  public static boolean method_two(String input) {
        if (input == null) {
            return false;
        }
        // normalize the string remove space and make lowercase
      String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = normalized.length() -1;
        while (left < right ){
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
  }
  public static void method_three() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the string: \r");
    String str = scanner.nextLine();
    String reverse = "";
    for( int i = str.length() -1; i > 0; i--) {
        reverse = reverse + str.charAt(i);
    }
    System.out.println(reverse);
  }
  public static boolean method_four() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter string: \r");
    String str = scanner.nextLine();
    String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String reverse = new StringBuilder(normalized).reverse().toString();
    return normalized.equals(reverse);
  }
}
