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
}
