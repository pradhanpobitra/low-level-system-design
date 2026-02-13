package strategy.design.pattern.with;

import strategy.design.pattern.with.strategy.ThrillDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new ThrillDriveStrategy());
    }
}
