package AbstractFactory.products;

public class ExpressDeliveryManager implements DeliveryManager {
    @Override
    public void manage() {
        System.out.println("Managing Express Delivery Request");
    }
}
