package designs.parkinglot.parkingspace.factories;

import designs.parkinglot.parkingspace.spacetypes.ParkingSpace;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpaceType;

public interface ParkingSpaceFactory {

    ParkingSpace createParkingSpace(ParkingSpaceType parkingSpaceType);
}
