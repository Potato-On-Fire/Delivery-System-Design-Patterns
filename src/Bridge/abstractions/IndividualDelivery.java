package Bridge.abstractions;

import Bridge.implementations.VehicleType;

public class IndividualDelivery extends Delivery {
    public IndividualDelivery(VehicleType vehicleType) {
        super(vehicleType);
    }

    @Override
    public void deliver() {
        System.out.println("Individual Delivery requested!");
        vehicleType.transport();
        System.out.println("Individual Delivery completed!");
    }
}
