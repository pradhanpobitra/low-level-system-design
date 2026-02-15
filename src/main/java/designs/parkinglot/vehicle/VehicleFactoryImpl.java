package designs.parkinglot.vehicle;

public class VehicleFactoryImpl implements VehicleFactory {

    @Override
    public Vehicle createVehicle(String vehicleId, String vehicleType) {
        if(vehicleType.contains("2")) {
            return new _2_Wheeler(vehicleId);
        } else if(vehicleType.contains("4")) {
            return new _4_Wheeler(vehicleId);
        }
        return null;
    }
}
