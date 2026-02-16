package designs.carrental.vehicle;

import designs.carrental.vehicle.metadata.VehicleMetadata;

import java.time.LocalDateTime;

public abstract class Vehicle {

    private LocalDateTime reservationTime;
    private final String colour;
    private final VehicleMetadata vehicleMetadata;
    private final int hourlyPrice;
    private boolean isReserved;
    private final int vehicleId;

    public Vehicle(VehicleMetadata vehicleMetadata, String colour, int hourlyPrice,  int vehicleId) {
        this.vehicleMetadata = vehicleMetadata;
        this.colour = colour;
        this.hourlyPrice = hourlyPrice;
        this.vehicleId = vehicleId;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public int getHourlyPrice() {
        return hourlyPrice;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public VehicleMetadata getVehicleMetadata() {
        return vehicleMetadata;
    }

    @Override
    public String toString() {
        return "\n ModelName: " + vehicleMetadata.getModelName()
                + ", Make Year: " + vehicleMetadata.getMakeYear()
                + ", Vehicle Type: " + vehicleMetadata.getVehicleType()
                + ", Manufacturer: " + vehicleMetadata.getManufacturer()
                + ", Horse Power: " + vehicleMetadata.getHorsePower()
                + ", Colour: " + colour
                + ", Hourly Price: " + hourlyPrice
                + ", isReserved: " + isReserved;
    }
}
