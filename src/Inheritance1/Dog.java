package Inheritance1;

public class Dog extends Annimal {
    String color="black";
    void voice() {
        System.out.println("barking...");
        System.out.println("animal color is " + super.color);

    }

}
