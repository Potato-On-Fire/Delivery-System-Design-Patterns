package Bridge;

import Bridge.abstractions.Delivery;
import Bridge.abstractions.IndividualDelivery;
import Bridge.abstractions.BusinessDelivery;
import Bridge.implementations.Motorbike;
import Bridge.implementations.Van;
import Bridge.implementations.Truck;

public class VehicleDeliveryClient {
    public static void main(String[] args) {
        Delivery individualDelivery1 = new IndividualDelivery(new Motorbike());
        individualDelivery1.deliver();
        System.out.println("------------------------------");
        Delivery individualDelivery2 = new IndividualDelivery(new Van());
        individualDelivery2.deliver();
        System.out.println("------------------------------");

        Delivery businessDelivery1 = new BusinessDelivery(new Motorbike());
        businessDelivery1.deliver();
        System.out.println("------------------------------");
        Delivery businessDelivery2 = new BusinessDelivery(new Van());
        businessDelivery2.deliver();
        System.out.println("------------------------------");
        Delivery businessDelivery3 = new BusinessDelivery(new Truck());
        businessDelivery3.deliver();
    }
}
