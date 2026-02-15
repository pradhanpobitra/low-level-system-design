package patterns.abstractfactory.factory;

import patterns.abstractfactory.vehicle.Vehicle;
import patterns.abstractfactory.vehicle.luxury.BMW;
import patterns.abstractfactory.vehicle.luxury.Mercedes;

public class LuxuryVehicleFactory implements AbstractVehicleFactory {

    public Vehicle getVehicle(String make) {
        return switch (make) {
            case "Mercedes" -> new Mercedes();
            case "BMW" -> new BMW();
            case null, default -> null;
        };
    }
}
