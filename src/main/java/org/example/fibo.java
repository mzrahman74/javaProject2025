package org.example;

public class fibo {
    static void fibonacci (int n) {
        int n1=0, n2=1;
        for (int i=0; i<n; i++) {
      System.out.println(n1 + " ");

      int n3 = n2 + n1;
      n1=n2;
      n2=n3;
        }
    }
    public static void main(String[] args){


        method_02(20);
    }
    public static void method_01(int n) {
        int n1=2, n2=3;
        for (int i=0; i<n; i++) {
      System.out.println(n1 + " ");
      int n3= n2 + n1;
      n1 = n2;
      n2=n3;
        }
    }
    public static void method_02(int n) {
        int n1=1, n2=2;
        for (int i=0; i<n; i++) {
      System.out.println(n1 + " ");
      int n3= n2 + n1;
      n1=n2;
      n2=n3;
        }
    }
}
