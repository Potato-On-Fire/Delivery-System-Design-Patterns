package Mediator;

import Singleton.Depot;

import java.util.ArrayList;
import java.util.List;

public class DeliveryHandlerDriver {
    private final DepotMediator mediator;
    private List<Vehicle> vehicles;

    public DeliveryHandlerDriver(DepotMediator mediator) {
        this.mediator = mediator;
        this.vehicles = new ArrayList<>();
    }

    // Register a vehicle to the delivery handler.
    public void registerVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Find an inactive vehicle to assign a new delivery.
    public Vehicle findInactiveVehicle() {
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isActive()) {
                return vehicle;
            }
        }
        return null; // No inactive vehicle found
    }

    // Handle a new delivery request.
    public boolean handleNewDelivery() {
        Vehicle vehicle = findInactiveVehicle();
        if (vehicle != null) {
            boolean entered = mediator.enterVehicle(vehicle);
            if (entered) {
                vehicle.setActive(true);
                System.out.println("Mediator.Vehicle " + vehicle.getId() + " assigned to new delivery and is now active.");
                return true;
            }
        }
        System.out.println("No inactive vehicle available for the new delivery.");
        return false;
    }

    // Handle vehicle return after delivery completion.
    public void handleReturn(Vehicle vehicle) {
        for (Depot depot : mediator.getDepots()) {
            if (depot.hasSpace()) {
                mediator.exitVehicle(vehicle, depot);
                vehicle.setActive(false);
                System.out.println("Mediator.Vehicle " + vehicle.getId() + " returned to Singleton.Depot at " + depot.getLocation().getCity());
                return;
            }
        }
        System.out.println("No space available in any depot for vehicle " + vehicle.getId() + " to return.");
    }
}
