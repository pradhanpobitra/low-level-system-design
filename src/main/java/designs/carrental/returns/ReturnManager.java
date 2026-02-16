package designs.carrental.returns;

import designs.carrental.store.Store;
import designs.carrental.vehicle.Vehicle;

public abstract class ReturnManager {
    private final Store store;

    public ReturnManager(Store store) {
        this.store = store;
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setReserved(false);
        store.addVehicle(vehicle);
        System.out.println("Vehicle with id: "
                + vehicle.getVehicleId()
                + ", modelName: "
                + vehicle.getVehicleMetadata().getModelName()
                + ", make year: "
                + vehicle.getVehicleMetadata().getMakeYear()
                + " has been returned");
    }
}
