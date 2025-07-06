package org.example;
/*
an enum is a special class that represents a group of constants (unchangeable variables, like final variables).
to create an enum, use the enum keyword(instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
 */


enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class enumClass {
  public static void main(String[] args) {
    Level myVar = Level.HIGH;
    switch (myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
      default:
        System.out.println("No level");
    }
  }
}
