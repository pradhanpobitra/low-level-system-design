package designs.carrental.filters;

import designs.carrental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortFilter extends FilteredResult {
    private final SortOption sortOption;

    public SortFilter(FilteredResult filtered, SortOption sortOption) {
        super(filtered);
        this.sortOption = sortOption;
    }

    @Override
    protected List<Vehicle> filterVehicles(List<Vehicle> vehicles) {
        List<Vehicle> res = new ArrayList<>(vehicles.stream().sorted(
                (a, b) -> {
                    return a.getHourlyPrice() <= b.getHourlyPrice() ? 1 : -1;
                }
        ).toList());
        if (sortOption == SortOption.DESC) {
            Collections.reverse(res);
        }
        return res;
    }
}
