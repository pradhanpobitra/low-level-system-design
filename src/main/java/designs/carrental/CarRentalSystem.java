package designs.carrental;

import designs.carrental.filters.FilteredResult;
import designs.carrental.location.Location;
import designs.carrental.reservation.ReservationManagerFactory;
import designs.carrental.returns.ReturnManagerFactory;
import designs.carrental.store.StoreFactory;
import designs.carrental.vehicle.Vehicle;

public class CarRentalSystem {
    private final StoreFactory storeFactory;
    private final ReservationManagerFactory reservationManagerFactory;
    private final ReturnManagerFactory returnManagerFactory;


    public CarRentalSystem() {
        this.storeFactory = new StoreFactory();
        this.reservationManagerFactory = new ReservationManagerFactory();
        this.returnManagerFactory = new ReturnManagerFactory();
    }

    public FilteredResult getVehicles(Location location) {
        return storeFactory.getStore(location).getVehicles();
    }

    public void reserveVehicle(Location location, Vehicle vehicle) {
        if (reservationManagerFactory.getReservationManager(location)
                .reserve(vehicle.getVehicleId())) {
            System.out.println("Reserved vehicle " + vehicle.getVehicleId());
        }
    }

    public void returnVehicle(Location location, Vehicle vehicle) {
        returnManagerFactory.getReturnManager(location).returnVehicle(vehicle);
    }
}
