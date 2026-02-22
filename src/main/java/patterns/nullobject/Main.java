package patterns.nullobject;

import patterns.nullobject.vehicle.Vehicle;
import patterns.nullobject.vehicle.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Truck");

        processVehicle(vehicle);
    }

    private static void processVehicle(Vehicle vehicle) {
        System.out.println("Processing Vehicle");
        System.out.println("Number of wheels: " + vehicle.getNumberOfWheels());
    }
}
