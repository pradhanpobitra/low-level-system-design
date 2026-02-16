package designs.carrental.vehicle;

import designs.carrental.vehicle.metadata.commuter.SwiftMetadata;

public class Swift extends Vehicle {

    public Swift(String colour, int  hourlyPrice, int  vehicleId) {
        super(SwiftMetadata.getInstance(), colour, hourlyPrice, vehicleId);
    }
}
