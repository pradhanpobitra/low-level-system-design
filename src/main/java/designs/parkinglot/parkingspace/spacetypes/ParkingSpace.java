package designs.parkinglot.parkingspace.spacetypes;

import designs.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpace {
    private boolean isOccupied;
    private final ParkingSpaceType parkingSpaceType;
    private Vehicle vehicle;

    public ParkingSpace(ParkingSpaceType parkingSpaceType) {
        this.parkingSpaceType = parkingSpaceType;
        this.isOccupied = false;
        this.vehicle = null;
    }

    public void park(Vehicle vehicle) {
        this.isOccupied = true;
        this.vehicle = vehicle;
    }

    public void unpark() {
        this.isOccupied = false;
        this.vehicle = null;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public ParkingSpaceType getParkingSpaceType() {
        return this.parkingSpaceType;
    }
}
