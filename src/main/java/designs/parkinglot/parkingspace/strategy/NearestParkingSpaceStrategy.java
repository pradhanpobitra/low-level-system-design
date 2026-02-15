package designs.parkinglot.parkingspace.strategy;

import designs.parkinglot.parkingspace.spacetypes.ParkingSpace;

import java.util.List;
import java.util.function.Function;

public class NearestParkingSpaceStrategy implements FindParkingSpaceStrategy {

    @Override
    public Function<List<ParkingSpace>, ParkingSpace> getParkingSpace() {
        return (parkingSpaces) -> {
            return parkingSpaces.stream().filter(
                    parkingSpace -> !parkingSpace.isOccupied()
            ).findFirst().orElse(null);
        };
    }
}
