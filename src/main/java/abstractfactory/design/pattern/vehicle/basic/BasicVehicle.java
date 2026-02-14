package abstractfactory.design.pattern.vehicle.basic;

import abstractfactory.design.pattern.vehicle.Vehicle;

public abstract class BasicVehicle extends Vehicle {

    @Override
    public String getType() {
        return "BASIC";
    }
}