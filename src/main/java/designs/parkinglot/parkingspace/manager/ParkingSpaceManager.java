package designs.parkinglot.parkingspace.manager;

import designs.parkinglot.parkingspace.factories.ParkingSpaceFactory;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpace;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpaceType;
import designs.parkinglot.parkingspace.strategy.FindParkingSpaceStrategy;
import designs.parkinglot.vehicle.Vehicle;
import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpaceManager {

    private final ParkingSpaceType  parkingSpaceType;
    private final List<ParkingSpace> occupiedParkingSpaces;
    private final List<ParkingSpace> vacantParkingSpaces;
    private final FindParkingSpaceStrategy findParkingSpaceStrategy;
    private final ParkingSpaceFactory parkingSpaceFactory;

    protected ParkingSpaceManager(ParkingSpaceType parkingSpaceType,
                                  FindParkingSpaceStrategy findParkingSpaceStrategy,
                                  ParkingSpaceFactory parkingSpaceFactory) {
        this.parkingSpaceType = parkingSpaceType;
        this.findParkingSpaceStrategy = findParkingSpaceStrategy;
        this.occupiedParkingSpaces = new ArrayList<>();
        this.vacantParkingSpaces = new ArrayList<>();
        this.parkingSpaceFactory = parkingSpaceFactory;
    }

    public boolean isAnyParkingSpaceAvailable() {
        return !this.vacantParkingSpaces.isEmpty();
    }

    public void addParkingSpace() {
        this.vacantParkingSpaces.add(this.parkingSpaceFactory.createParkingSpace(this.parkingSpaceType));
    }

    public void removeParkingSpace(ParkingSpace parkingSpace) {
        this.vacantParkingSpaces.remove(parkingSpace);
        this.occupiedParkingSpaces.remove(parkingSpace);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpace parkingSpace) {
        parkingSpace.park(vehicle);
        this.occupiedParkingSpaces.add(parkingSpace);
        this.vacantParkingSpaces.remove(parkingSpace);
    }

    public void unparkVehicle(ParkingSpace parkingSpace) {
        parkingSpace.unpark();
        this.occupiedParkingSpaces.remove(parkingSpace);
        this.vacantParkingSpaces.add(parkingSpace);
    }

    public ParkingSpace findParkingSpace() {
        return this.findParkingSpaceStrategy.getParkingSpace().apply(this.vacantParkingSpaces);
    }
}
