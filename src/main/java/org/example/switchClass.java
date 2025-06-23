package org.example;

public class switchClass {
  public static void method() {
    int day = 8;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Wrong day");
    }
  }
}
