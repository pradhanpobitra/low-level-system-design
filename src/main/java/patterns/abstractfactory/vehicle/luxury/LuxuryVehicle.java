package patterns.abstractfactory.vehicle.luxury;

import patterns.abstractfactory.vehicle.Vehicle;

public abstract class LuxuryVehicle extends Vehicle {

    @Override
    public String getType() {
        return "Luxury";
    }
}
