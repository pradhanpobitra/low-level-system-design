package patterns.strategy.with;

import patterns.strategy.with.strategy.ThrillDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new ThrillDriveStrategy());
    }
}
