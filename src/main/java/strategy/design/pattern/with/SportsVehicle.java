package strategy.design.pattern.with;

import strategy.design.pattern.with.strategy.ThrillDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new ThrillDriveStrategy());
    }
}
