package designs.carrental.vehicle.metadata.offroad;

import designs.carrental.vehicle.metadata.VehicleMetadata;

public class TharMetadata extends OffRoadVehicleMetadata {

    private TharMetadata() {

    }

    private static VehicleMetadata instance;

    public static VehicleMetadata getInstance() {
        if (instance == null) {
            instance = new TharMetadata();
        }
        return instance;
    }

    @Override
    public int getHorsePower() {
        return 2100;
    }

    @Override
    public String getMakeYear() {
        return "2022";
    }

    @Override
    public String getModelName() {
        return "Thar";
    }

    @Override
    public String getManufacturer() {
        return "Mahindra";
    }
}
