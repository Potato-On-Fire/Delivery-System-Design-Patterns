package Bridge.implementations;

public class Van extends VehicleType {
    @Override
    public void transport() {
        System.out.println("Delivering with a Van");
    }
}
