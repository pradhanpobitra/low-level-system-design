package strategy.design.pattern.without;

abstract public class Vehicle {
    Vehicle() {

    }

    void getGoing() {
        System.out.println("Lets get going!!");
        drive();
    }

    abstract void drive();
}
