package designs.parkinglot.parkingspace.factories;

import designs.parkinglot.parkingspace.spacetypes.ParkingSpace;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpaceType;
import designs.parkinglot.parkingspace.spacetypes._2WheelerParkingSpace;
import designs.parkinglot.parkingspace.spacetypes._4_WheelerParkingSpace;

public class ParkingSpaceFactoryImpl implements ParkingSpaceFactory {

    @Override
    public ParkingSpace createParkingSpace(ParkingSpaceType parkingSpaceType) {
        if(parkingSpaceType == ParkingSpaceType._2_WHEELER) {
            return new _2WheelerParkingSpace();
        } else if(parkingSpaceType == ParkingSpaceType._4_WHEELER) {
            return new _4_WheelerParkingSpace();
        }
        return null;
    }
}
