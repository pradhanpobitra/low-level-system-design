package designs.parkinglot.payment.factory;

import designs.parkinglot.payment.PaymentMode;
import designs.parkinglot.payment.strategy.CardPaymentStrategy;
import designs.parkinglot.payment.strategy.CashPaymentStrategy;
import designs.parkinglot.payment.strategy.PaymentStrategy;
import designs.parkinglot.payment.strategy.UpiPaymentStrategy;

public class PaymentStrategyFactoryImpl implements PaymentStrategyFactory {

    @Override
    public PaymentStrategy createPaymentStrategy(PaymentMode paymentMode) {
        if(paymentMode == PaymentMode.UPI) {
            return new UpiPaymentStrategy();
        } else if (paymentMode == PaymentMode.CASH) {
            return new CashPaymentStrategy();
        } else if (paymentMode == PaymentMode.CARD) {
            return new CardPaymentStrategy();
        }
        return null;
    }
}
