package designs.carrental.vehicle.metadata.commuter;

import designs.carrental.vehicle.metadata.VehicleMetadata;
import designs.carrental.vehicle.metadata.VehicleType;

public abstract class CommuterVehicleMetadata implements VehicleMetadata {

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.COMMUTER;
    }
}