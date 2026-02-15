package designs.parkinglot.vehicle;

public abstract class Vehicle {

    private final String vehicleId;
    private final VehicleType vehicleType;

    public Vehicle(String vehicleId, VehicleType vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }
}
