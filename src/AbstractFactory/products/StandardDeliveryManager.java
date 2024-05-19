package AbstractFactory.products;

public class StandardDeliveryManager implements DeliveryManager {
    @Override
    public void manage() {
        System.out.println("Managing Standard Delivery Request");
    }
}
