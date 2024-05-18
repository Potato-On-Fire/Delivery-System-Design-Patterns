package AbstractFactory.factories;

import AbstractFactory.products.DeliveryManager;
import AbstractFactory.products.DeliveryRequest;
import AbstractFactory.products.StandardDeliveryManager;
import AbstractFactory.products.StandardDeliveryRequest;

public class StandardDeliveryFactory extends DeliveryServiceFactory {
    @Override
    public DeliveryRequest createDeliveryRequest() {
        return new StandardDeliveryRequest();
    }

    @Override
    public DeliveryManager createDeliveryManager() {
        return new StandardDeliveryManager();
    }
}
