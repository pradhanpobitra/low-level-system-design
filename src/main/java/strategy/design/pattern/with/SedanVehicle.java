package strategy.design.pattern.with;

import strategy.design.pattern.with.strategy.ChillDriveStrategy;

public class SedanVehicle extends Vehicle {

    public SedanVehicle() {
        super(new ChillDriveStrategy());
    }
}
