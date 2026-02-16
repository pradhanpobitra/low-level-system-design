package designs.carrental.vehicle;

import designs.carrental.vehicle.metadata.offroad.TharMetadata;

public class Thar extends Vehicle {

    public Thar(String colour, int hourlyPrice, int vehicleId) {
        super(TharMetadata.getInstance(), colour, hourlyPrice, vehicleId);
    }
}
