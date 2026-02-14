package abstractfactory.design.pattern;

import abstractfactory.design.pattern.factory.AbstractVehicleFactory;
import abstractfactory.design.pattern.factory.BasicVehicleFactory;
import abstractfactory.design.pattern.factory.LuxuryVehicleFactory;

public class VehicleFactory {

    public AbstractVehicleFactory getVehicleFactory(String type) {
        return switch (type) {
            case "Luxury" -> new LuxuryVehicleFactory();
            case "Basic" -> new BasicVehicleFactory();
            case null, default -> null;
        };
    }
}
