package org.example;

public class outerClass {
    static int x = 10;

    class innerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
