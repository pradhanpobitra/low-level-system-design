package designs.parkinglot.payment;

import designs.parkinglot.payment.factory.PaymentStrategyFactory;
import designs.parkinglot.payment.factory.PaymentStrategyFactoryImpl;
import designs.parkinglot.payment.strategy.PaymentStrategy;

public class PaymentManager {

    private final PaymentStrategyFactory paymentStrategyFactory;

    public PaymentManager() {
        this.paymentStrategyFactory = new PaymentStrategyFactoryImpl();
    }

    public boolean processPayment(double fare, PaymentMode paymentMode) {
        PaymentStrategy paymentStrategy = this.paymentStrategyFactory
                .createPaymentStrategy(paymentMode);

        fare += paymentStrategy.getProcessingFee();
        boolean paymentSuccess = paymentStrategy.process(fare);
        if(!paymentSuccess) {
            System.out.println("Payment of: " + fare + " with payment mode: " + paymentMode + " failed");
        } else {
            System.out.println("Payment of: " + fare + " with payment mode: " + paymentMode + " successful");
        }
        return paymentSuccess;
    }
}
