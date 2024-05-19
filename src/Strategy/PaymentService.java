package Strategy;

public class PaymentService {
    private int cost;
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }
    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(cost);
        }
    }


}

