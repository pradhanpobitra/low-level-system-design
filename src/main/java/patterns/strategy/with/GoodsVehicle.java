package patterns.strategy.with;

import patterns.strategy.with.strategy.ChillDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new ChillDriveStrategy());
    }
}
