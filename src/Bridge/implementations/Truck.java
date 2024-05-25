package Bridge.implementations;

public class Truck implements VehicleType {
    @Override
    public void transport() {
        System.out.println("Delivering with a Truck");
    }
}
