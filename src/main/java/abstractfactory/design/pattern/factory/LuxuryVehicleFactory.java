package abstractfactory.design.pattern.factory;

import abstractfactory.design.pattern.vehicle.Vehicle;
import abstractfactory.design.pattern.vehicle.luxury.BMW;
import abstractfactory.design.pattern.vehicle.luxury.Mercedes;

public class LuxuryVehicleFactory implements AbstractVehicleFactory {

    public Vehicle getVehicle(String make) {
        return switch (make) {
            case "Mercedes" -> new Mercedes();
            case "BMW" -> new BMW();
            case null, default -> null;
        };
    }
}
