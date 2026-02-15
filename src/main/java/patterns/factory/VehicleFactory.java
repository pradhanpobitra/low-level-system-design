package patterns.factory;

import patterns.factory.vehicle.Amaze;
import patterns.factory.vehicle.BMW;
import patterns.factory.vehicle.Mercedes;
import patterns.factory.vehicle.Swift;
import patterns.factory.vehicle.Vehicle;
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
