// Interface for the mediator which defines methods for registering depots and managing vehicle entry and exit.
public interface DepotMediator {
    boolean registerDepot(Depot depot);
    boolean enterVehicle(Vehicle vehicle);
    void exitVehicle(Vehicle vehicle, Depot depot);
}
