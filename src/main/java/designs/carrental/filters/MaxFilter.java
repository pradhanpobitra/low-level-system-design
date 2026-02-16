package designs.carrental.filters;

import designs.carrental.vehicle.Vehicle;

import java.util.List;

public class MaxFilter extends FilteredResult {
    private final int maxPrice;

    public MaxFilter(FilteredResult filtered, int maxPrice) {
        super(filtered);
        this.maxPrice = maxPrice;
    }

    @Override
    protected List<Vehicle> filterVehicles(List<Vehicle> vehicles) {
        return vehicles.stream().filter(vehicle ->
                vehicle.getHourlyPrice() <= this.maxPrice).toList();
    }
}
