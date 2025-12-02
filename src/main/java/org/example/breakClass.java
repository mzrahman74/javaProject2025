package org.example;

public class breakClass {
    public static void method_one() {
       for (int i =0; i < 6; i++) {
           if (i == 2) {
               continue;
           }
           if (i == 6) {
               break;
           }
      System.out.println(i);
       }
    }
    public static void main(String[] args){
        method_one();
    }
}
