package Bridge.implementations;

public class Truck extends VehicleType {
    @Override
    public void transport() {
        System.out.println("Delivering with a Truck");
    }
}
