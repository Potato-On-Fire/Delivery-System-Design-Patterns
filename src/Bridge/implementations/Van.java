package Bridge.implementations;

public class Van implements VehicleType {
    @Override
    public void transport() {
        System.out.println("Delivering with a Van");
    }
}
