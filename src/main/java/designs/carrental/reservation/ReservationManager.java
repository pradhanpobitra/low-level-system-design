package designs.carrental.reservation;

import designs.carrental.store.Store;
import designs.carrental.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ReservationManager {
    private final Store store;

    public ReservationManager(Store store) {
        this.store = store;
    }

    public boolean reserve(int vehicleId) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Vehicle vehicle = store.getVehicle(vehicleId);
        if(vehicle.isReserved()) {
            System.out.println("Vehicle already reserved");
            return false;
        }

        if(!store.removeVehicle(vehicle)) {
            System.out.println("Vehicle does not exist in store");
            lock.unlock();
            return false;
        }
        vehicle.setReservationTime(LocalDateTime.now());
        vehicle.setReserved(true);
        store.addVehicle(vehicle);
        lock.unlock();
        return true;
    }
}
