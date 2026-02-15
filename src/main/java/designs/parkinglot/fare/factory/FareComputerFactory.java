package designs.parkinglot.fare.factory;

import designs.parkinglot.fare.FareComputer;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpaceType;

public interface FareComputerFactory {

    FareComputer createFareComputer(ParkingSpaceType parkingSpaceType);
}
