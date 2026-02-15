package designs.parkinglot.fare.factory;

import designs.parkinglot.fare.FareComputer;
import designs.parkinglot.fare._2WheelerFareComputer;
import designs.parkinglot.fare._4WheelerFareComputer;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpaceType;

public class FareComputerFactoryImpl implements FareComputerFactory {

    @Override
    public FareComputer createFareComputer(ParkingSpaceType parkingSpaceType) {
        if(parkingSpaceType == ParkingSpaceType._2_WHEELER) {
            return new _2WheelerFareComputer();
        } else if(parkingSpaceType == ParkingSpaceType._4_WHEELER) {
            return new _4WheelerFareComputer();
        }
        return null;
    }
}
