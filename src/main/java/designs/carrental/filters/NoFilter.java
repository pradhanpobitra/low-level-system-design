package designs.carrental.filters;

import designs.carrental.vehicle.Vehicle;

import java.util.List;

public class NoFilter extends FilteredResult {
    public NoFilter(List<Vehicle> vehicles) {
        super(vehicles);
    }

    @Override
    protected List<Vehicle> filterVehicles(List<Vehicle> vehicles) {
        return vehicles;
    }
}
