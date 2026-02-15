package designs.parkinglot.payment.strategy;

import designs.parkinglot.payment.PaymentMode;

public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public PaymentMode getPaymentMode() {
        return PaymentMode.UPI;
    }

    @Override
    public double getProcessingFee() {
        return 0;
    }

    @Override
    public boolean process(double fare) {
        System.out.println("UPI Payment failed" + fare);
        return false;
    }
}
