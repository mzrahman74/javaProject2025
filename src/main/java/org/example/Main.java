package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        polyClass obj = new polyClass();
        polyClass myPig = new Pig();
        Dog myDog = new Dog();
        obj.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        sensitiveClass sc = new sensitiveClass();
        sc.setName("Mohammad");
    System.out.println(sc.getName());
    outerClass myOuter = new outerClass();
    outerClass.innerClass myInner = myOuter.new innerClass();
    System.out.println(myInner.myInnerMethod());
    Vehicle vehicle = new Vehicle();
    Vehicle myCar = new Car();
    Vehicle myToyota = new Toyota();
    vehicle.honk();
    myCar.honk();
    myToyota.honk();
    reverseClass.method_06();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! \n" );

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i );
        }
             stringClass.method_07();
    }
}