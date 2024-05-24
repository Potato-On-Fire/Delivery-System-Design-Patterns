package Flyweight;

import Singleton.Address;

import java.util.Date;

public class DeliverySettings {
    private final float weight;
    private final int quantity;
    private final String recipient;
    private final Address destinationAddress;
    private final Date deliveryDate;
    private final DeliverySettingsFlyweight flyweight;

    // Constructor taking both intrinsic and extrinsic attributes
    public DeliverySettings(String deliveryType, String packagingType, String priority, String vehicleType, String sizeCategory,
                            float weight, int quantity, String recipient, Address destinationAddress, Date deliveryDate) {
        this.weight = weight;
        this.quantity = quantity;
        this.recipient = recipient;
        this.destinationAddress = destinationAddress;
        this.deliveryDate = deliveryDate;

        // Use the flyweight factory to create or retrieve the flyweight object
        this.flyweight = DeliverySettingsFlyweightFactory.getFlyweight(deliveryType, packagingType, priority, vehicleType, sizeCategory);
    }

    // Getters for all attributes
    public float getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSizeCategory() {
        return flyweight.getSizeCategory();
    }

    public String getRecipient() {
        return recipient;
    }

    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryType() {
        return flyweight.getDeliveryType();
    }

    public String getPackagingType() {
        return flyweight.getPackagingType();
    }

    public String getPriority() {
        return flyweight.getPriority();
    }

    public String getVehicleType() {
        return flyweight.getVehicleType();
    }
}
