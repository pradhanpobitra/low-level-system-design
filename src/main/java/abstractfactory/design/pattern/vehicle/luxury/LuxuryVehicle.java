package abstractfactory.design.pattern.vehicle.luxury;

import abstractfactory.design.pattern.vehicle.Vehicle;

public abstract class LuxuryVehicle extends Vehicle {

    @Override
    public String getType() {
        return "Luxury";
    }
}
