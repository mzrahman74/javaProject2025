package org.example;

public class polyClass {
    public void animalSound() {
    System.out.println("The animal makes a sound");
    }
}

class Pig extends polyClass {
    public void animalSound() {
    System.out.println("The pig says: wee wee");
    }
}

class Dog extends polyClass {
    public void animalSound(){
    System.out.println("The doe says: bow bow");
    }
}