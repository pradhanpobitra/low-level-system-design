package designs.carrental.vehicle.metadata;


public interface VehicleMetadata {
    int getHorsePower();

    String getMakeYear();

    VehicleType getVehicleType();

    String getModelName();

    String getManufacturer();
}