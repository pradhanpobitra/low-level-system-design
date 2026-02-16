package designs.carrental.reservation;

import designs.carrental.location.Location;
import java.util.Objects;

public class ReservationManagerFactory {

    public ReservationManager getReservationManager(Location location) {
        if(Objects.equals(location.getCity(), "Pune")) {
            return new PuneReservationManager();
        } else if(Objects.equals(location.getCity(), "Mumbai")) {
            return new MumbaiReservationManager();
        }
        return null;
    }
}
