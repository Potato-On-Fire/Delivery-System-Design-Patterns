package Adapter;

public class DeliverySystemAdapter implements ModernDeliverySystem {
    private final LegacyDeliverySystem legacySystem;

    public DeliverySystemAdapter(LegacyDeliverySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public boolean addDelivery(int weight, String sizeCategory, int quantity, String recipient, String status) {
        //New, improved implementation
        return true;
    }

    @Override
    public String getDeliveryStatus(int deliveryID) {
        //New, improved implementation
        return "Delivery" + deliveryID + "Status: Status, time, location, driver....\n";
    }

    @Override
    public boolean updateDeliveryStatus(int deliveryID) {
        //New, improved implementation
        return true;
    }

    //undo and delete delivery functions are used from the legacy system as is.
    @Override
    public boolean undoDelivery(int deliveryID) {
        return legacySystem.undoDelivery(deliveryID);
    }

    @Override
    public boolean deleteDelivery(int deliveryID) {
        return legacySystem.deleteDelivery(deliveryID);
    }
}
