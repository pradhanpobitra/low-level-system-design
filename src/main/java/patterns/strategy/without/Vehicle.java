package patterns.strategy.without;

abstract public class Vehicle {
    Vehicle() {

    }

    void getGoing() {
        System.out.println("Lets get going!!");
        drive();
    }

    abstract void drive();
}
