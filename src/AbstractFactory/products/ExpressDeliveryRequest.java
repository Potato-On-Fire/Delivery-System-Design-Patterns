package AbstractFactory.products;

public class ExpressDeliveryRequest implements DeliveryRequest {
    @Override
    public void request() {
        System.out.println("Creating Express Delivery Request");
    }
}
