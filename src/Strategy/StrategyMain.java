package Strategy;
import Strategy.CreditCardPayment;
import Strategy.FawryPayment;
public class StrategyMain {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new CreditCardPayment());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new FawryPayment());
        paymentService.processOrder(700);

    }
}
