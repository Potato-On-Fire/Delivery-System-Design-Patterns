package Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("cardNumber", "expiryDate", "cvv","expirydate");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Card Info: " + card);
        return true;
    }
    @Override
        public void pay(int amount) {
            System.out.println("Customer pays the money "+ amount + "EGP. using credit card");
        }

}
