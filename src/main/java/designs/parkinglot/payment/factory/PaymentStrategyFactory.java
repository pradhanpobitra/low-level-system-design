package designs.parkinglot.payment.factory;

import designs.parkinglot.payment.PaymentMode;
import designs.parkinglot.payment.strategy.PaymentStrategy;

public interface PaymentStrategyFactory {

    PaymentStrategy createPaymentStrategy(PaymentMode paymentMode);
}
