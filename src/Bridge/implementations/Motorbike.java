package Bridge.implementations;

public class Motorbike implements VehicleType {
    @Override
    public void transport() {
        System.out.println("Delivering with a Motorbike");
    }
}
