import java.util.ArrayList;
import java.util.List;

// Concrete implementation of the DepotMediator interface.
public class ConcreteDepotMediator implements DepotMediator {
    // List to hold the registered depots.
    private final List<Depot> depots = new ArrayList<>();

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
                System.out.println("Vehicle " + vehicle.getId() + " entered Depot at " + depot.getLocation());
                return true;
            }
        }
        System.out.println("No available space for Vehicle " + vehicle.getId());
        return false;
    }

    // Handles the exiting of a vehicle from a specified depot.
    @Override
    public void exitVehicle(Vehicle vehicle, Depot depot) {
        if (depot.exitVehicle()) {
            vehicle.setActive(false);
            System.out.println("Vehicle " + vehicle.getId() + " exited Depot at " + depot.getLocation());
        } else {
            System.out.println("Vehicle " + vehicle.getId() + " could not exit Depot at " + depot.getLocation());
        }
    }
}
