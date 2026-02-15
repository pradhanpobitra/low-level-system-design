package patterns.strategy.with;

import patterns.strategy.with.strategy.ThrillDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new ThrillDriveStrategy());
    }
}
