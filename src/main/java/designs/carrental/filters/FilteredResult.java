package designs.carrental.filters;

import designs.carrental.vehicle.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public abstract class FilteredResult {
    private final List<Vehicle> vehicles;

    protected FilteredResult(FilteredResult filtered) {
        this.vehicles = filterVehicles(filtered.vehicles);
    }

    protected FilteredResult(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    protected abstract List<Vehicle> filterVehicles(List<Vehicle> vehicles);

    @Override
    public String toString() {
        return vehicles.stream().map(Vehicle::toString).collect(Collectors.joining());
    }
}
