package designs.parkinglot.ticket;

import designs.parkinglot.parkingspace.spacetypes.ParkingSpace;
import designs.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private final Vehicle vehicle;
    private final ParkingSpace parkingSpace;
    private final LocalDateTime localDateTime;

    public Ticket(Vehicle vehicle, ParkingSpace parkingSpace) {
        this.vehicle = vehicle;
        this.parkingSpace = parkingSpace;
        this.localDateTime = LocalDateTime.now().minusMinutes(5);
    }

    public ParkingSpace getParkingSpace() {
        return this.parkingSpace;
    }

    public LocalDateTime getStartTime() {
        return this.localDateTime;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
