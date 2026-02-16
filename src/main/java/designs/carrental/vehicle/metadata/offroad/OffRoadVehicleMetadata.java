package designs.carrental.vehicle.metadata.offroad;

import designs.carrental.vehicle.metadata.VehicleMetadata;
import designs.carrental.vehicle.metadata.VehicleType;

public abstract class OffRoadVehicleMetadata implements VehicleMetadata {

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.OFF_ROAD;
    }
}
