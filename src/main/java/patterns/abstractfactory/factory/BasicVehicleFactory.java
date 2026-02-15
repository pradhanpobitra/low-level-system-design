package patterns.abstractfactory.factory;


import patterns.abstractfactory.vehicle.Vehicle;
import patterns.abstractfactory.vehicle.basic.Amaze;
import patterns.abstractfactory.vehicle.basic.Swift;

public class BasicVehicleFactory implements AbstractVehicleFactory {

    public Vehicle getVehicle(String make) {
        return switch (make) {
            case "Maruti" -> new Swift();
            case "Honda" -> new Amaze();
            case null, default ->  null;
        };
    }
}
