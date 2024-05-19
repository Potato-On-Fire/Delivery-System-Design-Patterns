package AbstractFactory.factories;

import AbstractFactory.products.DeliveryManager;
import AbstractFactory.products.DeliveryRequest;

public abstract class DeliveryServiceFactory {
    public abstract DeliveryRequest createDeliveryRequest();
    public abstract DeliveryManager createDeliveryManager();
}
