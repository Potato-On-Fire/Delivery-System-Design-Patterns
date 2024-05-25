package Adapter;

public class AdapterDriverClient {
    public static void main(String[] args) {
        // Create an instance of the legacy delivery system
        LegacyDeliverySystem legacySystem = new LegacyDeliverySystem();

        // Create an adapter instance for the modern delivery system
        ModernDeliverySystem modernSystem = new DeliverySystemAdapter(legacySystem);

        // Test adding a delivery
        boolean added = modernSystem.addDelivery(10, "Medium", 2, "John Doe", "Processing");
        System.out.println("Delivery added: " + added);

        // Test getting delivery status
        String status = modernSystem.getDeliveryStatus(1);
        System.out.println("Delivery status: " + status);

        // Test updating delivery status
        boolean updated = modernSystem.updateDeliveryStatus(1);
        System.out.println("Delivery status updated: " + updated);

        // Test undoing a delivery
        boolean undone = modernSystem.undoDelivery(1);
        System.out.println("Delivery undone: " + undone);

        // Test deleting a delivery
        boolean deleted = modernSystem.deleteDelivery(1);
        System.out.println("Delivery deleted: " + deleted);
    }
}
