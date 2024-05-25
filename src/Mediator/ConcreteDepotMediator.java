package Mediator;

import Singleton.Depot;

import java.util.ArrayList;
import java.util.List;
// Concrete implementation of the Mediator.Mediator.DepotMediator interface.
public class ConcreteDepotMediator implements DepotMediator {
    // List to hold the registered depots.
    private final List<Depot> depots = new ArrayList<>();

    //Depots managed getter
    public List<Depot> getDepots() {
        return depots;
    }

    // Registers a depot with the mediator.
    @Override
    public boolean registerDepot(Depot depot) {
        if (depots.size() < Depot.MAX_INSTANCES) {
            depots.add(depot);
            return true;
        }
        return false;
    }

    // Attempts to enter a vehicle into one of the registered depots.
    // Here the implementation should include assigning a vehicle to a specific depot that is closest to it, and in case it is full, try to search for other free depots.
    @Override
    public boolean enterVehicle(Vehicle vehicle) {
        for (Depot depot : depots) {
            if (depot.enterVehicle()) {
                vehicle.setActive(true);
                System.out.println("Mediator.Vehicle " + vehicle.getId() + " entered Singleton.Depot at " + depot.getLocation().getCity());
                return true;
            }
        }
        System.out.println("No available space for Mediator.Vehicle " + vehicle.getId());
        return false;
    }

    // Handles the exiting of a vehicle from a specified depot.
    @Override
    public void exitVehicle(Vehicle vehicle, Depot depot) {
        if (depot.exitVehicle()) {
            vehicle.setActive(false);
            System.out.println("Mediator.Vehicle " + vehicle.getId() + " exited Singleton.Depot at " + depot.getLocation().getCity());
        } else {
            System.out.println("Mediator.Vehicle " + vehicle.getId() + " could not exit Singleton.Depot at " + depot.getLocation().getCity());
        }
    }
}