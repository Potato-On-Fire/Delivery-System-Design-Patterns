import java.util.Date;

public class FlyweightDriverTestingMain {
    public static void main(String[] args) {
        // Create delivery settings using the new constructor
        DeliverySettings delivery1 = new DeliverySettings("Express", "Box", "High", "Truck", "Small",
                5.0f, 10, "Large", new Address("123 Main St", "Springfield", "IL", "62704"), new Date());
        DeliverySettings delivery2 = new DeliverySettings("Standard", "Envelope", "Low", "Motorcycle", "Paper",
                6.5f, 5, "Medium", new Address("456 Elm St", "Springfield", "IL", "62705"), new Date());
        DeliverySettings delivery3 = new DeliverySettings("Express", "Box", "High", "Truck", "Small",
                2.0f, 20, "Small", new Address("123 Main St", "Springfield", "IL", "62704"), new Date());

        // Output the details of each delivery
        System.out.println("Delivery 1:");
        printDeliveryDetails(delivery1);

        System.out.println("Delivery 2:");
        printDeliveryDetails(delivery2);

        System.out.println("Delivery 3:");
        printDeliveryDetails(delivery3);

        // Print the number of flyweights created
        System.out.println("Number of flyweights created: " + DeliverySettingsFlyweightFactory.getFlyweightsCount());
    }

    // Helper method to print delivery details
    private static void printDeliveryDetails(DeliverySettings delivery) {
        System.out.println("Delivery Type: " + delivery.getDeliveryType());
        System.out.println("Weight: " + delivery.getWeight());
        System.out.println("Recipient: " + delivery.getRecipient());
        System.out.println();
    }
}
