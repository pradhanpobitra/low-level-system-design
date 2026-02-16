package designs.carrental.store;

import designs.carrental.location.Location;
import designs.carrental.filters.FilteredResult;
import designs.carrental.filters.NoFilter;
import designs.carrental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class Store {
    private final List<Vehicle> vehicles;
    private final Location location;

    protected Store(Location location) {
        this.location = location;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public FilteredResult getVehicles() {
        return new NoFilter(vehicles);
    }

    public Vehicle getVehicle(int id) {
        return vehicles.stream().
                filter(vehicle -> vehicle.getVehicleId() ==  id)
                .findFirst().orElse(null);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean removeVehicle(Vehicle vehicle) {
        return vehicles.remove(vehicle);
    }

    public Location getLocation() {
        return location;
    }
}
