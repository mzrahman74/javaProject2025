package org.example;

import java.util.*;

public class arrayCollection {
  public static void method_One() {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Nissan");

    Collections.sort(cars);
    System.out.println(cars);
    cars.add(0, "Honda");
    System.out.println(cars.get(0));
  }

  public static void method_two() {
    LinkedList<Object> obj = new LinkedList<>();
    obj.add("Nissan");
    obj.add(10);
    obj.add(100);
    obj.add("Toyota");

    obj.addFirst(200);

    for (Object i : obj) {
      System.out.println(i);
    }
  }

  public static void method_three() {
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(100);
      numbers.add(300);
      numbers.add(50);
      numbers.add(500);

    numbers.forEach(System.out::println);

      numbers.sort(Collections.reverseOrder());

      for(Integer j : numbers) {
      System.out.println(j);
    }
  }
  public static void method_four() {
      HashMap<String, String> capitalCities = new HashMap<>();
      capitalCities.put("England", "London");
      capitalCities.put("Dhaka", "Bangladesh");
      capitalCities.put("Dhillon", "India");
      System.out.println(capitalCities);
    System.out.println(capitalCities.get("England"));
    System.out.println(capitalCities.size());

  }

  public static void method_five() {
      HashSet<String> names = new HashSet<>();
      names.add("Allah");
      names.add("Muhammad");
      names.add("David");
      names.add("Yusuf");

   for(String i: names) {
       if(names.contains(i)) {
           System.out.println(i + " was found in the set.");
       } else {
        System.out.println(i + " was not found in the set.");
       }

      }
  }
  public static void method_six() {
      ArrayList<String> cars = new ArrayList<>();
      cars.add("Honda");
      cars.add("Nissan");
      cars.add("Toyota");

      Iterator<String> it = cars.iterator();
    System.out.println(it.next());

    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
