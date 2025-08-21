package org.example;
/*
sum of an array
convert string to array
sort an array
 */

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class numberArray {
    public static void method_01() {
        int[] myArray = { 4, 5, 10, 11};
        int sum = 0;
        int i;

        for ( i =0; i<myArray.length; i++) {
            sum +=myArray[i];
        }
    System.out.println("The sum is: " + sum);
    }
    public static void method_02() {
        String myStr = "Mohammad";
        char[] myArray = myStr.toCharArray();

        for(char i: myArray) {
      System.out.println(i);
        }
    }
    public static void method_03() {
        String [] cars = { "Volvo", "BMW", "Telsa", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
    public static void method_04() {
        int [] numbers = {100, 2000, 300, 400, 50, 20, 10};
    Arrays.stream(numbers).sorted().forEach(System.out::println);
    }
    public static void method_05() {
        int[] ages = {4, 13, 15, 42, 51};
        float avg, sum =0;
        DecimalFormat df = new DecimalFormat("#.00");
        int length = ages.length;
        for (int age: ages) {
            sum +=age;
        }
        avg = sum/length;
    System.out.println("The average age is: " + df.format(avg));
    }
    public static void method_06() {
        int [] ages = {13, 16, 41, 51, 4};
        int lowestAge = ages[0];
        for (int age: ages) {
            if(lowestAge < age) {
                lowestAge = age;
            }
        }
    System.out.println("The lowest age in the array is: " + lowestAge);
    }
    public static void method_07() {
        int [] numbers = { 20, 100, 200, 300};
        int highest = numbers[0];

        for ( int number: numbers) {
            if (highest < number) {
                highest=number;
            }
        }
    System.out.println("The highest number in the array is: " + highest);
  }
  public static void method_08() {
        int [] arrays = {2, 5, 100, 200, 3, 78};
        int lowest = arrays[0];

        for ( int i: arrays) {
            if (lowest < i) {
                lowest = i;
            }
        }
        System.out.println("The lowest number in the array is: " + lowest);
  }
  public static void method_09() {
        int [] arr = { 10, 12, 11, 5 , 6};
        int secondHighest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    System.out.println(secondHighest);
  }
  public static void method_10() {
        int[] numbers = {10, 5, 12, 7, 2 };
        OptionalInt lowestNumberOptional = Arrays.stream(numbers).min();
        if(lowestNumberOptional.isPresent()) {
            int lowestNumber = lowestNumberOptional.getAsInt();
      System.out.println("The lowest number is: " + lowestNumber);
        } else {
      System.out.println("The array is empty");
        }
  }
  public static void main(String[] args){
      method_10();
  }
}
