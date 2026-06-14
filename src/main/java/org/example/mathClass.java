package org.example;

import static java.util.Arrays.stream;

public class mathClass {
  public static void method_01() {
    System.out.println(Math.max(5, 10));
    System.out.println(Math.min(5, 10));
    System.out.println(Math.sqrt(64));
    System.out.println(Math.abs(-4.7));
  }

  public static void method_02() {
    System.out.println(Math.random());
    int num = (int) (Math.random() * 10 + 1);
    String[] colors = {"Red", "Green", "Blue", "Yellow"};
    int index = (int) (Math.random() * colors.length);
    System.out.println("Random number: " + num);
    System.out.println("Random color: " + colors[index]);
  }

  public static void method_03() {
    int number = (int) (Math.random() * 4 + 1);
    String[] names = {"Mohammad", "Nusrat", "Naushin", "Nuhaa", "Yusuf"};
    int index = (int) (Math.random() * names.length);
    System.out.println("Random number: " + number);
    System.out.println("Random names: " + names[index]);
  }

  /*
  display random toyota car with random number
   */
  public static void method_04() {
    int number = (int) (Math.random() * 4 + 1);
    String[] cars = {
      "Toyota Camry", " Toyota Rav4", " Toyota BZ", "Toyota Corolla", " Toyota Prius"
    };
    int index = (int) (Math.random() * cars.length);
    System.out.println("Random number: " + number);
    System.out.println("Random car: " + cars[index]);
  }

  /*
  From service_lane scan lexus gx550 and need to display more money
   */
  public static void method_05() {
    int number = (int) (Math.random() * 8 + 1);
    String[] service_lane_cars = {
      "Toyota Camry",
      "Toyota Rav4",
      "Ford Escape",
      "Toyota Highlander",
      "Chevy Malibu",
      "Lexus GX550",
      "Toyota BZ",
      "Toyota Corolla",
      "Toyota Prius"
    };
    System.out.println("Car number: " + number);

    stream(service_lane_cars)
        .filter(car -> car.equals("Lexus GX550"))
        .findFirst()
        .ifPresent(
            c ->
                System.out.println(
                    "The "
                        + c
                        + " owner has to pay $129 plus tax for an oil change and rotation."));
  }

  public static void main(String[] args) {
    method_05();
  }
}
