package Adapter;

//Adaptee
public class LegacyDeliverySystem {
    boolean addDelivery(int weight, String sizeCategory, int quantity, String recipient, String status)
    {
        // Implementation (Included in DeliveryHandler)
        return true;
    }

    boolean undoDelivery(int deliveryID)
    {
        // Implementation (Included in DeliveryHandler)
        return true;
    }

    boolean deleteDelivery(int deliveryID)
    {
        // Implementation (Included in DeliveryHandler)
        return true;
    }

    String getDeliveryStatus(int deliveryID)
    {
        // Implementation (Included in DeliveryHandler)
        return "Active";
    }

    boolean updateDeliveryStatus(int deliveryID)
    {
        // Implementation (Included in DeliveryHandler)
        return true;
    }
}
