package Bridge.abstractions;

import Bridge.implementations.VehicleType;

public abstract class Delivery {
    protected VehicleType vehicleType;

    protected Delivery(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }

    public abstract void deliver();
}
