package designs.parkinglot.payment.strategy;

import designs.parkinglot.payment.PaymentMode;

public interface PaymentStrategy {

    PaymentMode getPaymentMode();

    double getProcessingFee();

    boolean process(double fare);
}
