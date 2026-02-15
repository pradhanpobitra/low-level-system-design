package designs.parkinglot.parkingspace.manager;

import designs.parkinglot.parkingspace.factories.ParkingSpaceFactoryImpl;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpaceType;
import designs.parkinglot.parkingspace.strategy.FarthestParkingSpaceStrategy;
import designs.parkinglot.parkingspace.strategy.FindParkingSpaceStrategy;

public class _4WheelerParkingSpaceManager extends ParkingSpaceManager {
    private static _4WheelerParkingSpaceManager instance = null;

    private _4WheelerParkingSpaceManager(FindParkingSpaceStrategy findParkingSpaceStrategy) {
        super(ParkingSpaceType._4_WHEELER, findParkingSpaceStrategy, new ParkingSpaceFactoryImpl());
    }

    public static _4WheelerParkingSpaceManager getInstance() {
        if (instance == null) {
            instance = new _4WheelerParkingSpaceManager(new FarthestParkingSpaceStrategy());
        }
        return instance;
    }
}
