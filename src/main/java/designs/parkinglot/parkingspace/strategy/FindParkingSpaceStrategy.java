package designs.parkinglot.parkingspace.strategy;

import designs.parkinglot.parkingspace.spacetypes.ParkingSpace;

import java.util.List;
import java.util.function.Function;

public interface FindParkingSpaceStrategy {

    Function<List<ParkingSpace>, ParkingSpace> getParkingSpace();
}
