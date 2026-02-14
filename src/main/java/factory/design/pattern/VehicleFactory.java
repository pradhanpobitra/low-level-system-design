package factory.design.pattern;

import factory.design.pattern.vehicle.Amaze;
import factory.design.pattern.vehicle.BMW;
import factory.design.pattern.vehicle.Mercedes;
import factory.design.pattern.vehicle.Swift;
import factory.design.pattern.vehicle.Vehicle;
import org.jetbrains.annotations.Nullable;

public class VehicleFactory {

    @Nullable
    public static Vehicle getVehicle(String make) {
        return switch (make) {
            case "Maruti" -> new Swift();
            case "Honda" -> new Amaze();
            case "BMW" -> new BMW();
            case "Mercedes" -> new Mercedes();
            case null, default -> null;
        };
    }
}
