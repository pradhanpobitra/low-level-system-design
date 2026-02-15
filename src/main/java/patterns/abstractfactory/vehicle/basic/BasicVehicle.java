package patterns.abstractfactory.vehicle.basic;

import patterns.abstractfactory.vehicle.Vehicle;

public abstract class BasicVehicle extends Vehicle {

    @Override
    public String getType() {
        return "BASIC";
    }
}