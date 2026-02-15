package patterns.abstractfactory.factory;

import patterns.abstractfactory.vehicle.Vehicle;

public interface AbstractVehicleFactory {

    Vehicle getVehicle(String make);
}
