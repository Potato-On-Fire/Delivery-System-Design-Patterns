package AbstractFactory.products;

public class StandardDeliveryRequest implements DeliveryRequest {
    @Override
    public void request() {
        System.out.println("Creating Standard Delivery Request");
    }
}
