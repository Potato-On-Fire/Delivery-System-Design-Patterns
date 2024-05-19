package AbstractFactory.factories;

import AbstractFactory.products.DeliveryManager;
import AbstractFactory.products.DeliveryRequest;
import AbstractFactory.products.ExpressDeliveryManager;
import AbstractFactory.products.ExpressDeliveryRequest;

public class ExpressDeliveryFactory extends DeliveryServiceFactory {
    @Override
    public DeliveryRequest createDeliveryRequest() {
        return new ExpressDeliveryRequest();
    }

    @Override
    public DeliveryManager createDeliveryManager() {
        return new ExpressDeliveryManager();
    }
}
