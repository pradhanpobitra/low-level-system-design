package patterns.abstractfactory;

import patterns.abstractfactory.factory.AbstractVehicleFactory;
import patterns.abstractfactory.factory.BasicVehicleFactory;
import patterns.abstractfactory.factory.LuxuryVehicleFactory;

public class VehicleFactory {

    public AbstractVehicleFactory getVehicleFactory(String type) {
        return switch (type) {
            case "Luxury" -> new LuxuryVehicleFactory();
            case "Basic" -> new BasicVehicleFactory();
            case null, default -> null;
        };
    }
}
