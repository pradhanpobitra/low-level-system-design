package designs.parkinglot;

import designs.parkinglot.gates.EntryGate;
import designs.parkinglot.gates.ExitGate;
import designs.parkinglot.parkingspace.manager.ParkingSpaceManager;
import designs.parkinglot.parkingspace.manager._2WheelerParkingSpaceManager;
import designs.parkinglot.parkingspace.manager._4WheelerParkingSpaceManager;
import designs.parkinglot.payment.PaymentMode;
import designs.parkinglot.ticket.Ticket;
import designs.parkinglot.vehicle.Vehicle;
import designs.parkinglot.vehicle._2_Wheeler;
import designs.parkinglot.vehicle._4_Wheeler;

public class Orchestrator {

    public static void main(String[] args) {
        final EntryGate entryGate = new EntryGate();
        final ExitGate exitGate = new ExitGate();
        final ParkingSpaceManager _2WheelerPSmanager = _2WheelerParkingSpaceManager.getInstance();
        final ParkingSpaceManager _4WheelerPSmanager = _4WheelerParkingSpaceManager.getInstance();
        _2WheelerPSmanager.addParkingSpace();
        _2WheelerPSmanager.addParkingSpace();
        _2WheelerPSmanager.addParkingSpace();
        _4WheelerPSmanager.addParkingSpace();

        final Vehicle bike1 = new _2_Wheeler("AS06AM7538");
        final Vehicle car1 = new _4_Wheeler("AS06T5947");

        final Ticket ticket2 = entryGate.issueNewTicket(car1);
        final Ticket ticket1 = entryGate.issueNewTicket(bike1);


        if(ticket1 != null) {
            double fare = exitGate.computeFare(ticket1);
            boolean paymentStatus = exitGate.processPayment(fare, PaymentMode.UPI);
            if(!paymentStatus) {
                exitGate.processPayment(fare, PaymentMode.CASH);
            }
            exitGate.vacateParkingSpace(ticket1);
        }
        if(ticket2 != null) {
            double fare = exitGate.computeFare(ticket2);
            boolean paymentStatus = exitGate.processPayment(fare, PaymentMode.UPI);
            if(!paymentStatus) {
                exitGate.processPayment(fare, PaymentMode.CASH);
            }
            exitGate.vacateParkingSpace(ticket2);
        }

    }
}
