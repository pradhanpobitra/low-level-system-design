package patterns.strategy.with;

import patterns.strategy.with.strategy.DriveStrategy;

abstract public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void getGoing() {
        System.out.println("Lets get going!!");
        driveStrategy.drive();
    }
}
