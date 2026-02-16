package designs.carrental.store;

import designs.carrental.location.Location;

import java.util.Objects;

public class StoreFactory {

    public Store getStore(Location location) {
        if(Objects.equals(location.getCity(), "Pune")) {
            return PuneStore.getInstance();
        } else if (Objects.equals(location.getCity(), "Mumbai")) {
            return MumbaiStore.getInstance();
        }
        return null;
    }
}
