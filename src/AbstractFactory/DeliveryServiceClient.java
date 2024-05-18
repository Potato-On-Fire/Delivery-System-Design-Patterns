package AbstractFactory;

import AbstractFactory.factories.DeliveryServiceFactory;
import AbstractFactory.factories.StandardDeliveryFactory;
import AbstractFactory.products.DeliveryManager;
import AbstractFactory.products.DeliveryRequest;

public class DeliveryServiceClient {
    public static void main(String[] args) {
        DeliveryServiceFactory standardDelivery = new StandardDeliveryFactory();
        DeliveryRequest standardRequest = standardDelivery.createDeliveryRequest();
        DeliveryManager standardManager = standardDelivery.createDeliveryManager();

        standardRequest.request();
        standardManager.manage();

        DeliveryServiceFactory expressDelivery = new StandardDeliveryFactory();
        DeliveryRequest expressRequest = expressDelivery.createDeliveryRequest();
        DeliveryManager expressManager = expressDelivery.createDeliveryManager();

        expressRequest.request();
        expressManager.manage();
    }
}
