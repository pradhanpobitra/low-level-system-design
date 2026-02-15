package patterns.strategy.with;

import patterns.strategy.with.strategy.ChillDriveStrategy;

public class SedanVehicle extends Vehicle {

    public SedanVehicle() {
        super(new ChillDriveStrategy());
    }
}
