package designs.parkinglot.payment.strategy;

import designs.parkinglot.payment.PaymentMode;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public PaymentMode getPaymentMode() {
        return PaymentMode.CASH;
    }

    @Override
    public double getProcessingFee() {
        return 0;
    }

    @Override
    public boolean process(double fare) {
        System.out.println("Processed Cash Payment" + fare);
        return true;
    }
}
