package designs.parkinglot.gates;

import designs.parkinglot.parkingspace.manager.ParkingSpaceManager;
import designs.parkinglot.parkingspace.factories.ParkingSpaceManagerFactory;
import designs.parkinglot.parkingspace.factories.ParkingSpaceManagerFactoryImpl;
import designs.parkinglot.parkingspace.spacetypes.ParkingSpace;
import designs.parkinglot.ticket.Ticket;
import designs.parkinglot.vehicle.Vehicle;

public class EntryGate {
    private final ParkingSpaceManagerFactory parkingSpaceManagerFactory;

    public EntryGate() {
        this.parkingSpaceManagerFactory = new ParkingSpaceManagerFactoryImpl();
    }

    public Ticket issueNewTicket(Vehicle vehicle) {
        if(!isAnyParkingSpaceAvailable(vehicle)) {
            System.out.println("Sorry parking space is not available");
            return null;
        }
        ParkingSpace parkingSpace = bookParkingSpace(vehicle);
        return new Ticket(vehicle, parkingSpace);
    }

    private boolean isAnyParkingSpaceAvailable(Vehicle vehicle) {
        ParkingSpaceManager parkingSpaceManager = this.parkingSpaceManagerFactory
                .getParkingSpaceManager(vehicle);

        return parkingSpaceManager.isAnyParkingSpaceAvailable();
    }

    private ParkingSpace bookParkingSpace(Vehicle vehicle) {
        ParkingSpaceManager parkingSpaceManager = this.parkingSpaceManagerFactory
                .getParkingSpaceManager(vehicle);

        ParkingSpace parkingSpace = parkingSpaceManager.findParkingSpace();
        parkingSpaceManager.parkVehicle(vehicle,  parkingSpace);
        return parkingSpace;
    }
}
