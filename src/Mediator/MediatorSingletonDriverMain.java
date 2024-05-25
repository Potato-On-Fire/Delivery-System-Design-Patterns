package Mediator;

import Singleton.Address;
import Singleton.Depot;

public class MediatorSingletonDriverMain {
    public static void main(String[] args) {
        // Create a mediator
        DepotMediator mediator = new ConcreteDepotMediator();

        // Create depots and register them with the mediator
        Depot depot1 = Depot.getInstance(0);
        Depot depot2 = Depot.getInstance(1);

        Address address1 = new Address(), address2 = new Address();

        address1.setCity("Cairo");
        address2.setCity("Alexandria");

        depot1.setLocation(address1);
        depot2.setLocation(address2);

        mediator.registerDepot(depot1);
        mediator.registerDepot(depot2);

        // Create delivery handler
        DeliveryHandlerDriver deliveryHandler = new DeliveryHandlerDriver(mediator);

        // Create and register vehicles
        Vehicle vehicle1 = new Vehicle("V1");
        Vehicle vehicle2 = new Vehicle("V2");
        Vehicle vehicle3 = new Vehicle("V3");

        deliveryHandler.registerVehicle(vehicle1);
        deliveryHandler.registerVehicle(vehicle2);
        deliveryHandler.registerVehicle(vehicle3);

        // Handle new delivery requests
        deliveryHandler.handleNewDelivery(); // Should assign vehicle1
        deliveryHandler.handleNewDelivery(); // Should assign vehicle2
        deliveryHandler.handleNewDelivery(); // Should try to assign vehicle3, might fail if depots are full

        // Simulate vehicle return
        deliveryHandler.handleReturn(vehicle1);
        deliveryHandler.handleReturn(vehicle2);

        // Try handling another delivery
        deliveryHandler.handleNewDelivery(); // Should now be able to assign vehicle1 or vehicle2 again
    }
}
