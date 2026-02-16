package designs.carrental.store;

import designs.carrental.location.Location;
import designs.carrental.vehicle.Swift;
import designs.carrental.vehicle.Thar;

public class PuneStore extends Store {
    private PuneStore() {
        super(new Location("Pune"));
        addVehicle(new Swift("Red", 100, 1));
        addVehicle(new Swift("Red", 310, 2));
        addVehicle(new Swift("White", 500, 3));
        addVehicle(new Thar("Black", 1000, 4));
        addVehicle(new Thar("Black", 2000, 5));
        addVehicle(new Thar("White", 5000, 6));
        addVehicle(new Thar("Red", 10000, 7));
    }

    private static PuneStore instance;

    public static PuneStore getInstance() {
        if (instance == null) {
            instance = new PuneStore();
        }
        return instance;
    }
}
