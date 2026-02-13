package strategy.design.pattern.with;

public class Driver {

    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.getGoing();
    }
}
