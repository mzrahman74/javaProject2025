package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class collectCall {
    public static void main(String[] args){
        HashMap<String, String> names = new HashMap<>();
        names.put("Bangladesh", "Dhaka");
        names.put("USA", "Austin");
        System.out.println(names);
        method_one();
        method_two();
        method_three();
    }
    /*
    input string characters count
     */
    public static void method_one() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the string: \r");
    String st = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Map<Character, Integer> charCount = new HashMap<>();
        for( char c : st.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) +1);
       }
        System.out.println("Character occurrences in \"" + st + "\":");
        for (Map.Entry<Character, Integer> entry: charCount.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    /*
    show input string character with index
     */
    public static void method_two() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the string: \r");
    String input = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "");
    for(int i=0; i<input.length(); i++) {
      System.out.println("Index " + i + ": " + input.charAt(i));
    }
    }
     /*
    count character for the given string
     */
    public static void method_three() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String input = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int[] count = new  int[256]; // ASCII size
        for(int i=0; i<input.length(); i++) {
            count[input.charAt(i)]++;
        }
        for(int i=0; i<256; i++) {
            if(count[i] > 0) {
        System.out.println("Character '" + (char)i + " appears " + count[i] + " times");
            }
        }
    }
}

