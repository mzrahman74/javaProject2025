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

import static java.util.Arrays.stream;

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
    stream(numbers).sorted().forEach(System.out::println);
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
        int secondHighest = stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    System.out.println(secondHighest);
  }
  public static void method_10() {
        int[] numbers = {10, 5, 12, 7, 2 };
        OptionalInt lowestNumberOptional = stream(numbers).min();
        if(lowestNumberOptional.isPresent()) {
            int lowestNumber = lowestNumberOptional.getAsInt();
      System.out.println("The lowest number is: " + lowestNumber);
        } else {
      System.out.println("The array is empty");
        }
  }
  public static void main(String[] args){
      method_25();
  }
  public static void method_11() {
        int [] numbers = {500, 600, 700, 10, 20, 1, 2};
    stream(numbers).sorted().forEach(s -> System.out.println(s));
  }
  public static void method_12() {
       String str = "Yusuf";
       char[] arr = str.toCharArray();

       for(char j: arr) {
      System.out.println(j);
       }
       for (int j=0; j < arr.length; j++) {
      System.out.println(j + ":" + arr[j]);
       }
  }

  public static void method_13() {
    int[] numbers = {300, 400, 500, 600};
    int highest = numbers[0];

    for (int number : numbers) {
      if (highest < number) {
        highest = number;
      }
    }
    System.out.println("The highest number in the array is: " + highest);
  }
  public static void method_14() {
        int [] ages = {200, 55, 65, 75, 100};
        int lowestAge = ages[0];
        for (int age: ages){
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
      System.out.println("The lowest age in the array is: " + lowestAge);
  }

  public static void method_15() {
        int[] numbers = {300, 45, 55, 65, 100};
        int lowestNumber = numbers[0];

        for(int number: numbers) {
            if (lowestNumber > number) {
                lowestNumber = number;
            }
        }
        System.out.println("The lowest number in the array is: " + lowestNumber);


  }

  public static void method_16() {
        String name = "Austin";
        char [] nameArray = name.toCharArray();
        for (char j : nameArray) {
            System.out.println(j);
        }
        for (int j=0; j<nameArray.length; j++) {
            System.out.println(j + ":" + nameArray[j]);
        }
  }

  public static void method_17() {
        int [] numbers = { 100, 300, 400, 0, 4, 500, 600};
      int second =  stream(numbers).boxed().sorted().skip(1).findFirst().get();
      System.out.println(second);
  }
/*
find the highest number from the arrays
 */
  public static void method_18() {
        int [] arraysNumber = { 300, 5000, 500, 700, 100, 900, 1000};
        int highestNUmber = stream(arraysNumber).boxed().max(Comparator.naturalOrder()).get();
    System.out.println("Highest number from the array: " + highestNUmber);
  }
  /* find the lowest number from the arrays
  */
  public static void method_19() {
      int [] numberArray = { 6000, 1000, 100, 200, 500};
      int lowestNumber = stream(numberArray).boxed().min(Comparator.naturalOrder()).get();
    System.out.println("Lowest number from the array: " + lowestNumber);
  }
  /*
  find the 3rd highest number in the array
   */
public static void method_20() {
    int [] arraysNumber = { 400, 500, 600, 900, 100, 500, 700};
    int third_highest_number = stream(arraysNumber).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
    System.out.println(third_highest_number);
}
/*
find the 3rd lowest number in the array
 */
public static void method_21() {
    int [] numbersArray = {3, 45, 13, 16, 5, 500, 600, 700, 5000};
    int third_lowest_number = stream(numbersArray).boxed().sorted().skip(2).findFirst().get();
    System.out.println(third_lowest_number);
}
/*
find the 4th lowest number in the array
 */
public static void method_22() {
    int [] numbers = {300, 400, 200, 50, 1000, 800};
    int forth_lowest_number = stream(numbers).boxed().sorted().skip(3).findFirst().get();
    System.out.println(forth_lowest_number);
}
/*
find the first highest number in the array
 */
public static void method_23() {
    int [] arrays = {100, 200, 300, 500, 50, 4, 2000};
    int first_highest_number = stream(arrays).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
    System.out.println(first_highest_number);
}
/*
find the second-highest number in the array
 */
public static void method_24() {
    int [] numbers = {300, 400, 500, 750};
    int second_highest_number = stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    System.out.println(second_highest_number);
}

  /*
  find the 4th highes number in the array
   */
  public static void method_25() {
    int[] numbers = {100, 500, 600, 450, 320, 120, 20, 1, 70};
    int fourth_highest_number =
        stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
    System.out.println(fourth_highest_number);
  }
}
