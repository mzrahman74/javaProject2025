package org.example;
/*
Write a method to compare two JSON objects and return failures for the mismatches

 */

/*
Write a Java program to print the number of occurrences of each character in the given string.

"TECHNOLOGY"

 */

import java.util.HashMap;
import java.util.Map;

public class JsonClass {
    public static void main(String[] args) {
        String   jsonString1 = "{\"name\":\"John Doe\",\"age\":30,\"city\":\"New York\"}";
        String jsonString2 = "{\"age\":30,\"city\":\"New York\",\"name\":\"John Doe\"}";

        if (jsonString1 == jsonString2) {
            System.out.println("match");
        } else {
            System.out.println("does not match");
        }
        assertEquals(jsonString1, jsonString2); //suggested use assertEquals from Then(). asserThat().statusCode().response().body()
        method_one();
    }

    private static void assertEquals(String jsonString1, String jsonString2) {

    }
    public static void method() {
        String str = "TECHNOLOGY";
        int count = str.length();
        System.out.println(count);

        for (int i = 0; i<count; i++) {
            System.out.println("number:" + i + str.charAt(i) );

        }
    }
    public static void method_one() {
        String input = "TECHNOLOGY";
        String inpout1 = "technology";
         input.equalsIgnoreCase(inpout1);
         Map<Character, Integer> charCountMap = new HashMap<>();

         for (char c : input.toCharArray() ) {
             charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);

         }
        System.out.println("Character occurrences in \"" + input + "\":");
         for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
             System.out.println(entry.getKey() + ": " + entry.getValue());
         }
    }
}
