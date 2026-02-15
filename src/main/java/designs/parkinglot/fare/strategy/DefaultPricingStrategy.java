package designs.parkinglot.fare.strategy;

import java.time.LocalDateTime;

public class DefaultPricingStrategy implements PricingStrategy {
    @Override
    public double getTotalPrice(LocalDateTime start, LocalDateTime end) {
        return 20.0;
    }
}
