package designs.parkinglot.gates;

import designs.parkinglot.fare.FareComputer;
import designs.parkinglot.fare.factory.FareComputerFactory;
import designs.parkinglot.fare.factory.FareComputerFactoryImpl;
import designs.parkinglot.parkingspace.factories.ParkingSpaceManagerFactory;
import designs.parkinglot.parkingspace.factories.ParkingSpaceManagerFactoryImpl;
import designs.parkinglot.parkingspace.manager.ParkingSpaceManager;
import designs.parkinglot.payment.PaymentManager;
import designs.parkinglot.payment.PaymentMode;
import designs.parkinglot.ticket.Ticket;

import java.time.LocalDateTime;

public class ExitGate {
    private final FareComputerFactory fareComputerFactory;
    private final PaymentManager paymentManager;
    private final ParkingSpaceManagerFactory parkingSpaceManagerFactory;

    public ExitGate() {
        this.fareComputerFactory = new FareComputerFactoryImpl();
        this.paymentManager = new PaymentManager();
        this.parkingSpaceManagerFactory  = new ParkingSpaceManagerFactoryImpl();
    }

    public double computeFare(Ticket ticket) {
        FareComputer fareComputer = this.fareComputerFactory.
                createFareComputer(ticket.getParkingSpace().getParkingSpaceType());
        double fare = fareComputer.getComputedFare(ticket.getStartTime(), LocalDateTime.now());
        System.out.println("Fare for " + ticket.getVehicle().getVehicleId() + " is: " + fare);
        return fare;
    }

    public boolean processPayment(double fare, PaymentMode paymentMode) {
        return this.paymentManager.processPayment(fare, paymentMode);
    }

    public void vacateParkingSpace(Ticket ticket) {
        ParkingSpaceManager parkingSpaceManager = this.parkingSpaceManagerFactory
                .getParkingSpaceManager(ticket.getVehicle());

        parkingSpaceManager.removeParkingSpace(ticket.getParkingSpace());
    }
}
