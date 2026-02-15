package designs.parkinglot.parkingspace.factories;

import designs.parkinglot.parkingspace.manager.ParkingSpaceManager;
import designs.parkinglot.parkingspace.manager._2WheelerParkingSpaceManager;
import designs.parkinglot.parkingspace.manager._4WheelerParkingSpaceManager;
import designs.parkinglot.vehicle.Vehicle;
import designs.parkinglot.vehicle.VehicleType;

public class ParkingSpaceManagerFactoryImpl implements ParkingSpaceManagerFactory {

    @Override
    public ParkingSpaceManager getParkingSpaceManager(Vehicle vehicle) {
        if(vehicle.getVehicleType() == VehicleType._2_WHEELER) {
            return _2WheelerParkingSpaceManager.getInstance();
        } else if (vehicle.getVehicleType() == VehicleType._4_WHEELER) {
            return _4WheelerParkingSpaceManager.getInstance();
        }
        return null;
    }
}
