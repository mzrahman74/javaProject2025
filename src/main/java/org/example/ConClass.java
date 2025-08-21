package org.example;

/*
Java Constructor- in java is a special method and that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes. Can't be return type void. Also note that constructor
is called when the object is created.
 */

public class ConClass {
    int x;

public ConClass() {
    x = 10; // set the initial value for the class attribute x
}
public static void main(String[] args){
    ConClass conClass = new ConClass();
    System.out.println(conClass.x); // print the value of x
}

}
