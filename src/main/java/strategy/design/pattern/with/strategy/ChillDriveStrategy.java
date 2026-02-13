package strategy.design.pattern.with.strategy;

public class ChillDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Chill Drive...");
    }
}
