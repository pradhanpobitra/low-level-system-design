package abstractfactory.design.pattern.factory;


import abstractfactory.design.pattern.vehicle.Vehicle;
import abstractfactory.design.pattern.vehicle.basic.Amaze;
import abstractfactory.design.pattern.vehicle.basic.Swift;

public class BasicVehicleFactory implements AbstractVehicleFactory {

    public Vehicle getVehicle(String make) {
        return switch (make) {
            case "Maruti" -> new Swift();
            case "Honda" -> new Amaze();
            case null, default ->  null;
        };
    }
}
