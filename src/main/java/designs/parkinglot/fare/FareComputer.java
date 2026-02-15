package designs.parkinglot.fare;

import designs.parkinglot.fare.strategy.PricingStrategy;

import java.time.LocalDateTime;

public abstract class FareComputer {
    protected final PricingStrategy pricingStrategy;

    protected FareComputer(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public abstract double getComputedFare(LocalDateTime start, LocalDateTime end);
}
