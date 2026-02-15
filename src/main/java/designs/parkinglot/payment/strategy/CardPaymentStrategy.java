package designs.parkinglot.payment.strategy;

import designs.parkinglot.payment.PaymentMode;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public PaymentMode getPaymentMode() {
        return PaymentMode.CARD;
    }

    @Override
    public double getProcessingFee() {
        return 15.0;
    }

    @Override
    public boolean process(double fare) {
        System.out.println("Processed Card Payment: " + fare);
        return true;
    }
}
