package org.example;

public class overloading {
    static int plusMethodInd(int x, int y) {
        return x + y;
    }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
    public static void main(String[] args){
        int myNum1 = plusMethodInd(8, 10);
        double myNum2 = plusMethodDouble(4.3, 10.5);
    System.out.println("int " + myNum1);
    System.out.println("double " + myNum2);
    }
}
