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
    public static void method_two() {
        for (int j=0; j<100; j++) {
            if(j==50){
                continue;
            }
            if(j==75) {
                break;
            }
      System.out.println(j);
        }
    }

    public static void main(String[] args){
        method_two();
    }
}
