package abstractfactory.design.pattern.factory;

import abstractfactory.design.pattern.vehicle.Vehicle;

public interface AbstractVehicleFactory {

    Vehicle getVehicle(String make);
}
