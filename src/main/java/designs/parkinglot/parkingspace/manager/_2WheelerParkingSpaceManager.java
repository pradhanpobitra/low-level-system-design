package designs.parkinglot.parkingspace.manager;

import designs.parkinglot.parkingspace.factories.ParkingSpaceFactoryImpl;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpaceType;
import designs.parkinglot.parkingspace.strategy.FindParkingSpaceStrategy;
import designs.parkinglot.parkingspace.strategy.NearestParkingSpaceStrategy;

public class _2WheelerParkingSpaceManager extends ParkingSpaceManager {
    private static _2WheelerParkingSpaceManager instance = null;

    private _2WheelerParkingSpaceManager(FindParkingSpaceStrategy findParkingSpaceStrategy) {
        super(ParkingSpaceType._2_WHEELER, findParkingSpaceStrategy,
                new  ParkingSpaceFactoryImpl());
    }

    public static _2WheelerParkingSpaceManager getInstance() {
        if(instance == null) {
            instance = new _2WheelerParkingSpaceManager(new NearestParkingSpaceStrategy());
        }
        return instance;
    }
}
