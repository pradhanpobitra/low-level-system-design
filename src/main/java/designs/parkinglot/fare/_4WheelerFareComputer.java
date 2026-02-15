package designs.parkinglot.fare;

import designs.parkinglot.fare.strategy.MinutePricingStrategy;
import java.time.LocalDateTime;

public class _4WheelerFareComputer extends FareComputer {

    public _4WheelerFareComputer() {
        super(new MinutePricingStrategy());
    }

    @Override
    public double getComputedFare(LocalDateTime start, LocalDateTime end) {
        return this.pricingStrategy.getTotalPrice(start, end) * 2.0;
    }
}
