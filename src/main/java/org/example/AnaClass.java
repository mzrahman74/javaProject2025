package org.example;

import java.util.Arrays;

public class AnaClass {
    public static boolean method_one(){
        String str_one = "kisten";
        String str_two = "silent";

        char [] arr_one = str_one.toCharArray();
        char [] arr_two = str_two.toCharArray();
        Arrays.sort(arr_one);
        Arrays.sort(arr_two);

        boolean isAnagram = Arrays.equals(arr_one, arr_two);
        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
        return isAnagram;
    }
    public static void main(String[] args){
        method_one();
    }
}
