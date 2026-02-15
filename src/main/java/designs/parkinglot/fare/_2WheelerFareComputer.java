package designs.parkinglot.fare;

import designs.parkinglot.fare.strategy.MinutePricingStrategy;
import java.time.LocalDateTime;

public class _2WheelerFareComputer extends FareComputer {

    public _2WheelerFareComputer() {
        super(new MinutePricingStrategy());
    }

    @Override
    public double getComputedFare(LocalDateTime start, LocalDateTime end) {
        return this.pricingStrategy.getTotalPrice(start, end);
    }
}
