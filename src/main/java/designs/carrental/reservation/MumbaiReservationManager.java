package designs.carrental.reservation;


import designs.carrental.store.MumbaiStore;

public class MumbaiReservationManager extends ReservationManager {

    public MumbaiReservationManager() {
        super(MumbaiStore.getInstance());
    }
}
