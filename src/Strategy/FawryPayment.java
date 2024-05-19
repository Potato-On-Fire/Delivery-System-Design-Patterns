package Strategy;

public class FawryPayment implements PaymentStrategy{
    private Fawry transaction;

    @Override
    public void collectPaymentDetails() {
        transaction = new Fawry("refNumber", "amount");
        System.out.println("Collecting Transaction Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Transaction Info: " + transaction);
        return true;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Customer pays the money "+ amount + "EGP. using Fawry");
    }

}
