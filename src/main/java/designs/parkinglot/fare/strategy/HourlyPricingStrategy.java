package designs.parkinglot.fare.strategy;

import java.time.LocalDateTime;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public double getTotalPrice(LocalDateTime start, LocalDateTime end) {
        return (end.getHour() - start.getHour()) * 2.0;
    }
}
