package strategy.design.pattern.without;

public class Driver {

    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();

        vehicle.getGoing();
    }
}
