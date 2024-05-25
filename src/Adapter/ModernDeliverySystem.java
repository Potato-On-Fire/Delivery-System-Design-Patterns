package Adapter;

public interface ModernDeliverySystem {
    boolean addDelivery(int weight, String sizeCategory, int quantity, String recipient, String status);
    String getDeliveryStatus(int deliveryID);
    boolean updateDeliveryStatus(int deliveryID);
    boolean undoDelivery(int deliveryID);
    boolean deleteDelivery(int deliveryID);
}
