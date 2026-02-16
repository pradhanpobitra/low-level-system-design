package designs.carrental.reservation;

import designs.carrental.store.PuneStore;

public class PuneReservationManager extends ReservationManager {

    public PuneReservationManager() {
        super(PuneStore.getInstance());
    }
}
