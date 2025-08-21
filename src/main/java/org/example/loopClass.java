package org.example;

public class loopClass {
    public static void method_01() {
        int countdown = 0;
        while (countdown < 5) {
      System.out.println(countdown + ":" + "New year countdown");
      countdown++;
        }
    System.out.println("Happy New Year!!");
    }
    public static void main(String[] args){
        method_04();
    }
    public static void method_02() {
        int i = 0;
        while (i < 5) {
      System.out.println(i);
      i++;
        }
    }
    public static void method_03() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
    public static void method_04() {
        int dice = 1;
        while (dice <= 6) {
            if(dice < 6) {
                System.out.println( dice + " : No Yatzy.");
            } else {
        System.out.println( dice + " : Yatzy");
            }
            dice = dice + 1;
        }
    }
}
