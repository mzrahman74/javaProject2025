package org.example;

import java.util.*;
import java.util.function.Consumer;

public class arrayCollection {
  public static void method_one() {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Volvo");
    cars.add("Bmw");
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

    for (Integer j : numbers) {
      System.out.println(j);
    }
  }

  public static void method_four() {
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("Dhaka", "Bangladesh");
    capitalCities.put("London", "England");
    capitalCities.put("Delhi", "India");
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

    for (String i : names) {
      if (names.contains(i)) {
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

    do {
      System.out.println(it.next());
    } while (it.hasNext());
  }

  public static void method_seven() {
    String[] array = {"Dog", "Cat", "Rabbit"};

    // Create a modifiable list
    List<String> list = new ArrayList<>(Arrays.asList(array));
    list.add("Hamster");
    list.remove("Cat");
    System.out.println(list);
  }

  public static void method_eight() {
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(5);
    numbers.add(10);
    numbers.add(6);
    numbers.add(3);

    for (int i = 0; i <= 10; i++) {
      if (numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
  }

  public static void method_nine() {
    TreeSet<String> names = new TreeSet<>();
    names.add("Rahman");
    names.add("Nuhaa");
    names.add("Amina");
    names.add("Rahman");
    names.add("Mike");
    names.ceiling("Abdul");
    names.add("Naushin");
    names.add("Biplob");

    for (String i : names) {
      System.out.println(i);
    }
  }

  public static void method_ten() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(10);
    numbers.add(12);
    Consumer<Integer> method = System.out::println;
    numbers.forEach(method);
  }

  interface StringFunction {
    String run(String str);
  }

  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
//    method_one();
//    method_two();
//    method_three();
//    method_four();
//    method_five();
//    method_six();
//    method_seven();
//    method_eight();
//    method_nine();
//    method_ten();
//    method_eleven();
//    method_twelve();
//    method_thirteen();
 //   method_fifteen();
    method_twenty();
  }

  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }

  public static void method_eleven() {
    HashSet<String> names = new HashSet<>();
    names.add("Hassan");
    names.add("Nuhaa");

    for (String j : names) {
      if (names.contains(j)) {
        System.out.println("found");
      } else {
        System.out.println("not found");
      }
    }
    String test = "Isha";
    if (names.contains(test)) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }
  }

  public static void method_twelve() {
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(100);
    numbers.add(200);
    numbers.add(300);
    for (Integer i : numbers) {
      if (numbers.contains(400)) {
        System.out.println("number found ");
      } else {
        System.out.println("not found ");
      }
    }
  }

  public static void method_thirteen() {
    ArrayList<String> trees = new ArrayList<>();
    trees.add("Mango");
    trees.add("Banana");
    trees.add("Orange");

    Iterator<String> tree = trees.iterator();

    do {
      System.out.println(tree.next());
    } while (tree.hasNext());
  }
  public static void method_fourteen() {
    ArrayList<Integer> trees = new ArrayList<>();
    trees.add(100);
    trees.add(500);
    trees.add(32);
    trees.add(400);

    Iterator<Integer> num = trees.iterator();
    do {
      System.out.println(num.next());
    } while (num.hasNext());

  }
  public static void method_fifteen() {
    HashSet<String> names = new HashSet<>();
    names.add("Mohammad");
    names. add("Nuhaa");
    names.add("Naushin");
    names.add("Yusuf");

    for(String s : names) {
      if(s.contains("Nuhaa")) {
        System.out.println("names found");
      } else {
        System.out.println("Names not found");
      }

    }
    Iterator <String> it = names.iterator();
    while(it.hasNext()) {
      if(it.next().contains("Nuhaa")){
        System.out.println("found");
        } else {
        System.out.println("not found");
      }
    }
  }
  public static void method_sixteen() {
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(100);
    numbers.add(200);
    numbers.add(300);
    numbers.add(50);

    for (Integer i: numbers) {
      if (i.equals(300)) {
        System.out.println("number found " + i);
      } else {
        System.out.println("not found");
      }
    }
  }
  public static void method_seventeen() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(500);
    numbers. add(100);
    numbers.add(300);
    numbers.add(50);
    numbers.add(25);

    Iterator<Integer> num = numbers.iterator();
    while(num.hasNext()) {
      if(num.next().equals(100)) {
        System.out.println("Found");
      } else {
        System.out.println("Not found");
      }
    }
  }
  public static void method_eighteen() {
    ArrayList<Integer> lists = new ArrayList<>();
    lists.add(50);
    lists.add(100);
    lists.add(500);
    lists.add(500);

    for(Integer list : lists) {
      if(list == 50) {
        System.out.println("Found: " + list);
        break;
      }
    }
  }
  public static void method_nineteen() {
    ArrayList<String> names = new ArrayList<>();
    names.add("Nuhaa");
    names.add("Naushin");
    names.add("Yusuf");
    names.add("Nusrat");

    names.stream().filter(n -> Objects.equals(n, "Naushin")).findFirst().ifPresent(n -> System.out.println("Found: " + n));
  }
  public static void method_twenty() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(100);
    numbers.add(200);
    numbers.add(50);
    numbers.add(5);
    numbers.add(650);
    numbers.stream()
        .filter(n -> Objects.equals(n, 5))
        .findFirst()
        .ifPresent(n -> System.out.println("Found: " + n));
  }
}
