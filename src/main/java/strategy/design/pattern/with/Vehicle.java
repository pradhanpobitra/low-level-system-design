package strategy.design.pattern.with;

import strategy.design.pattern.with.strategy.DriveStrategy;

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
