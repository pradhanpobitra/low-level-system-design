package designs.carrental.vehicle.metadata.commuter;

import designs.carrental.vehicle.metadata.VehicleMetadata;

public class SwiftMetadata extends CommuterVehicleMetadata {

    private SwiftMetadata() {}

    private static VehicleMetadata instance;
    public static VehicleMetadata getInstance() {
        if (instance == null) {
            instance = new SwiftMetadata();
        }
        return instance;
    }

    @Override
    public int getHorsePower() {
        return 1200;
    }

    @Override
    public String getMakeYear() {
        return "2021";
    }

    @Override
    public String getModelName() {
        return "Swift";
    }

    @Override
    public String getManufacturer() {
        return "Maruti";
    }
}
