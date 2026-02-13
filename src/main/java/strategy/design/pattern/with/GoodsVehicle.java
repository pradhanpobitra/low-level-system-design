package strategy.design.pattern.with;

import strategy.design.pattern.with.strategy.ChillDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new ChillDriveStrategy());
    }
}
