package designs.carrental;

import designs.carrental.filters.*;
import designs.carrental.location.Location;

public class Site {
    public static void main(String[] args) {

        CarRentalSystem carRentalSystem = new CarRentalSystem();
        Location location1 = new Location("Pune");
        Location location2 = new Location("Mumbai");

        FilteredResult vehiclesLocation1 = carRentalSystem.getVehicles(location1);
        System.out.println("Vehicles from Pune: " + vehiclesLocation1);


//        vehiclesLocation1 = new MinFilter(vehiclesLocation1, 1000);
//        vehiclesLocation1 = new MaxFilter(vehiclesLocation1, 6000);
        vehiclesLocation1 = new SortFilter(vehiclesLocation1, SortOption.DESC);
        System.out.println("Vehicles from Pune: \n" + vehiclesLocation1);

        FilteredResult vehiclesLocation2 = carRentalSystem.getVehicles(location2);
        System.out.println("Vehicles from Mumbai: \n" + vehiclesLocation2);

        carRentalSystem.reserveVehicle(location1, vehiclesLocation1.getVehicles().get(1));
        carRentalSystem.reserveVehicle(location1, vehiclesLocation1.getVehicles().get(1));
        carRentalSystem.returnVehicle(location1, vehiclesLocation1.getVehicles().get(1));
        carRentalSystem.reserveVehicle(location1, vehiclesLocation1.getVehicles().get(1));

        carRentalSystem.reserveVehicle(location2, vehiclesLocation2.getVehicles().get(1));
        carRentalSystem.reserveVehicle(location2, vehiclesLocation2.getVehicles().get(0));
        carRentalSystem.reserveVehicle(location2, vehiclesLocation2.getVehicles().get(1));
        carRentalSystem.returnVehicle(location2, vehiclesLocation2.getVehicles().get(1));
        carRentalSystem.reserveVehicle(location2, vehiclesLocation2.getVehicles().get(1));

        carRentalSystem.reserveVehicle(location1, vehiclesLocation1.getVehicles().get(3));
        carRentalSystem.reserveVehicle(location1, vehiclesLocation1.getVehicles().get(4));
        carRentalSystem.reserveVehicle(location1, vehiclesLocation1.getVehicles().get(5));
        carRentalSystem.reserveVehicle(location1, vehiclesLocation1.getVehicles().get(6));

        carRentalSystem.returnVehicle(location1, vehiclesLocation1.getVehicles().get(3));
        carRentalSystem.returnVehicle(location1, vehiclesLocation1.getVehicles().get(4));
        carRentalSystem.returnVehicle(location1, vehiclesLocation1.getVehicles().get(5));
        carRentalSystem.returnVehicle(location1, vehiclesLocation1.getVehicles().get(6));
    }
}
