package designs.parkinglot.vehicle;

public interface VehicleFactory {

    Vehicle createVehicle(String vehicleId, String vehicleType);
}
