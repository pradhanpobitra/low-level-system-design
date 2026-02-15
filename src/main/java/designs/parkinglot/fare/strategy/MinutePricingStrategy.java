package designs.parkinglot.fare.strategy;

import java.time.LocalDateTime;

public class MinutePricingStrategy implements PricingStrategy {
    @Override
    public double getTotalPrice(LocalDateTime start, LocalDateTime end) {
        return (end.getMinute() - start.getMinute()) * 2.5;
    }
}
