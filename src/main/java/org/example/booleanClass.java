package org.example;

public class booleanClass {
  public static void method_01() {
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
  }

  public static void method_02() {
    int myAge = 25;
    int votingAge = 18;
    System.out.println(true);

    if (myAge >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote.");
    }
  }

  public static void method_03() {
    int number = 9;
    if (number % 2 == 0) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }
  }
  public static void method_04() {
      int myNum = -20;
      if (myNum > 0) {
      System.out.println("The value is a positive.");
      } else if (myNum < 0) {
      System.out.println("The value is a negative.");
      } else {
      System.out.println("The value is 0.");
      }
  }
  public static void main(String[] args){
      method_04();
  }

}