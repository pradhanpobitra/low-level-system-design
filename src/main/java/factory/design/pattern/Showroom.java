package factory.design.pattern;

import factory.design.pattern.vehicle.Vehicle;

public class Showroom {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Mercedes");
        System.out.println(vehicle);
    }
}
