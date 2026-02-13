package strategy.design.pattern.with.strategy;

public class ThrillDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Thrill drive...");
    }
}
