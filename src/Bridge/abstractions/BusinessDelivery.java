package Bridge.abstractions;

import Bridge.implementations.VehicleType;

public class BusinessDelivery extends Delivery {
    public BusinessDelivery(VehicleType vehicleType) {
        super(vehicleType);
    }

    @Override
    public void deliver() {
        System.out.println("Business Delivery requested!");
        vehicleType.transport();
        System.out.println("Business Delivery completed!");
    }
}
