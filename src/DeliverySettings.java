import java.util.Date;

public class DeliverySettings{
    private final float weight;
    private final int quantity;
    private final String recipient;
    private final Address destinationAddress;
    private final Date deliveryDate;
    //DeliverySettings intrinsic attributes (Flyweight)
    private final DeliverySettingsFlyweight flyweight;

    public DeliverySettings(DeliverySettingsFlyweight flyweight, float weight, int quantity, String recipient, Address destinationAddress, Date deliveryDate) {
        this.flyweight = flyweight;
        this.weight = weight;
        this.quantity = quantity;
        this.recipient = recipient;
        this.destinationAddress = destinationAddress;
        this.deliveryDate = deliveryDate;
    }
    //Public getters for all attributes, including flyweight ones.
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
