package org.example;

/*
Write a method to compare two JSON objects and return failures for the mismatches

 */
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonClass {
  public static void main(String[] args) throws JsonProcessingException {
    compareJson();
  }

  public static void compareJson() throws JsonProcessingException {
    String jsonString1 = "{\"Name\":\"John Doe\",\"Age\":30,\"City\":\"New York\"}";
    String jsonString2 =
        "{\"Age\":35,\"City\":\"Dallas\",\"Name\":\"Jon Smith\", \"Country\":\"USA\"}";

    ObjectMapper mapper = new ObjectMapper();

    JsonNode node1 = mapper.readTree(jsonString1);
    JsonNode node2 = mapper.readTree(jsonString2);

    List<String> failures = new ArrayList<>();
    compareNodes("", node1, node2, failures);
    failures.forEach(System.out::println);
  }

  private static void compareNodes(
      String path, JsonNode node1, JsonNode node2, List<String> failures) {

    // check missing fields
    Iterator<String> fields = node1.fieldNames();

    while (fields.hasNext()) {
      String field = fields.next();
      String currentPath = path.isEmpty() ? field : path + "." + field;

      if (!node2.has(field)) {
        failures.add("Missing field: " + currentPath);
        continue;
      }
      JsonNode value1 = node1.get(field);
      JsonNode value2 = node2.get(field);

      if (value1.isObject() && value2.isObject()) {
        compareNodes(currentPath, value1, value2, failures);
      } else if (!value1.equals(value2)) {
        failures.add("Mismatch at " + currentPath + " Expected: " + value1 + " Actual: " + value2);
      }
    }
    // check extra fields
    Iterator<String> fields2 = node2.fieldNames();

    while (fields2.hasNext()) {
      String field = fields2.next();

      if (!node1.has(field)) {
        String currentPath = path.isEmpty() ? field : path + "." + field;
        failures.add("Unexpected field " + currentPath);
      }
    }
  }
    /*
    Write a Java program to print the number of occurrences of each character in the given string.

    "TECHNOLOGY"

     */
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
        String input1 = "technology";
         input.equalsIgnoreCase(input1);
         Map<Character, Integer> charCountMap = new HashMap<>();

         for (char c : input.toCharArray() ) {
             charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);

         }
        System.out.println("Character occurrences in \"" + input + "\":");
         for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
             System.out.println(entry.getKey() + ": " + entry.getValue());
         }
    }
    /*
    input string characters occurrence
     */
    public static void method_two() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string: \r");
        String str = scanner.nextLine();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char i : str.toCharArray()) {
            charCountMap.put(i, charCountMap.getOrDefault(i,0) +1);
        }
    System.out.println("character occurrences in \"" + str + "\":");
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
        }
  }
  /*
  input string count with stream
   */
    public static void method_three() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the string: \r");
    String str = scanner.nextLine();
    Map<Character, Long> counts = str.chars()
            .mapToObj(c-> (char) c).collect(Collectors.groupingBy(c ->c, Collectors.counting()));
    System.out.println(counts);
    }
}
