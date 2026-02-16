package designs.carrental.filters;

import designs.carrental.vehicle.Vehicle;

import java.util.List;

public class MinFilter extends FilteredResult {
    private final int minPrice;

    public MinFilter(FilteredResult filtered, int minPrice) {
        super(filtered);
        this.minPrice = minPrice;
    }

    @Override
    protected List<Vehicle> filterVehicles(List<Vehicle> vehicles) {
        return vehicles.stream().filter(vehicle ->
                vehicle.getHourlyPrice() >= this.minPrice).toList();
    }
}
