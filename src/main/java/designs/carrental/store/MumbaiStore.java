package designs.carrental.store;

import designs.carrental.location.Location;
import designs.carrental.vehicle.Thar;

public class MumbaiStore extends Store {
    private MumbaiStore() {
        super(new Location("Mumbai"));
        addVehicle(new Thar("Red", 3000, 8));
        addVehicle(new Thar("Red", 2500, 9));
    }

    private static MumbaiStore instance;
    public static MumbaiStore getInstance() {
        if (instance == null) {
            instance = new MumbaiStore();
        }
        return instance;
    }
}
