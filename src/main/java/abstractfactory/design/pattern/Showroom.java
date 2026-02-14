package abstractfactory.design.pattern;

import abstractfactory.design.pattern.factory.AbstractVehicleFactory;
import abstractfactory.design.pattern.vehicle.Vehicle;

public class Showroom {

    public static void main(String[] args) {
        String type = "Luxury";
        String make = "BMW";

        VehicleFactory vehicleFactory = new VehicleFactory();
        AbstractVehicleFactory abstractVehicleFactory = vehicleFactory.getVehicleFactory(type);
        Vehicle vehicle = abstractVehicleFactory.getVehicle(make);

        System.out.println(vehicle);

        make = "Honda";
        vehicle = abstractVehicleFactory.getVehicle(make);
        System.out.println(vehicle);
    }
}
