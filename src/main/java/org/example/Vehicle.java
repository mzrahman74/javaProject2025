package org.example;

public class Vehicle {
    protected String brand = "Ford";
    public void honk() {
    System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public void honk() {
    System.out.println(brand + modelName + " Gang gang");
    }

}

class Toyota extends  Vehicle {
    @Override
    public void honk() {
        super.honk();
    System.out.println(" boo boo");
    }

}

class Honda extends Vehicle {
    @Override
    public void honk() {
    System.out.println("honda honda");
    }
}