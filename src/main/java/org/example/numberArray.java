package org.example;
/*
sum of an array
convert string to array
sort an arry
 */

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
}
