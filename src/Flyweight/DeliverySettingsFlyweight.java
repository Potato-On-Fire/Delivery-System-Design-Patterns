package Flyweight;

import java.util.Objects;

public class DeliverySettingsFlyweight {
    private final String deliveryType; //(e.g., standard, express)
    private final String packagingType; //(e.g., box, envelope)
    private final String priority; //(e.g., high, medium, low)
    private final String vehicleType; //(e.g., Motorcycle, Truck, Airplane..)
    private final String sizeCategory;

    public DeliverySettingsFlyweight(String deliveryType, String packagingType, String priority, String vehicleType, String sizeCategory) {
        this.deliveryType = deliveryType;
        this.packagingType = packagingType;
        this.priority = priority;
        this.vehicleType = vehicleType;
        this.sizeCategory = sizeCategory;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public String getPriority() {
        return priority;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getSizeCategory() {
        return sizeCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliverySettingsFlyweight that = (DeliverySettingsFlyweight) o;
        return Objects.equals(deliveryType, that.deliveryType) &&
                Objects.equals(packagingType, that.packagingType) &&
                Objects.equals(priority, that.priority) &&
                Objects.equals(vehicleType, that.vehicleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryType, packagingType, priority, vehicleType);
    }
}

