package designs.parkinglot.fare.strategy;

import java.time.LocalDateTime;

public interface PricingStrategy {

    double getTotalPrice(LocalDateTime start, LocalDateTime end);
}
