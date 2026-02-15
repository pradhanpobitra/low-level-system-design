package designs.parkinglot.parkingspace.factories;

import designs.parkinglot.parkingspace.manager.ParkingSpaceManager;
import designs.parkinglot.vehicle.Vehicle;

public interface ParkingSpaceManagerFactory {

    ParkingSpaceManager getParkingSpaceManager(Vehicle vehicle);
}
