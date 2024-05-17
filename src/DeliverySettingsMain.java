//import java.util.Date;
//
//public class DeliverySettingsMain {
//    public static void main(String[] args) {
//        DeliverySettingsFlyweight flyweight1 = DeliverySettingsFlyweightFactory.getFlyweight("Express", "Box", "High", "Truck", "In Transit");
//        DeliverySettingsFlyweight flyweight2 = DeliverySettingsFlyweightFactory.getFlyweight("Standard", "Envelope", "Low", "Motorcycle", "Delivered");
//
//        Address address1 = new Address("123 Main St", "Springfield", "IL", "62704");
//        Address address2 = new Address("456 Elm St", "Springfield", "IL", "62705");
//
//        DeliverySettings delivery1 = new DeliverySettings(flyweight1, 5.0f, 10, "Large", "John Doe", address1, new Date());
//        DeliverySettings delivery2 = new DeliverySettings(flyweight1, 6.5f, 5, "Medium", "Jane Smith", address2, new Date());
//        DeliverySettings delivery3 = new DeliverySettings(flyweight2, 2.0f, 20, "Small", "Alice Johnson", address1, new Date());
//
//        System.out.println("Delivery 1:");
//        System.out.println("Delivery Type: " + delivery1.getDeliveryType());
//        System.out.println("Weight: " + delivery1.getWeight());
//        System.out.println("Recipient: " + delivery1.getRecipient());
//
//        System.out.println("Delivery 2:");
//        System.out.println("Delivery Type: " + delivery2.getDeliveryType());
//        System.out.println("Weight: " + delivery2.getWeight());
//        System.out.println("Recipient: " + delivery2.getRecipient());
//
//        System.out.println("Delivery 3:");
//        System.out.println("Delivery Type: " + delivery3.getDeliveryType());
//        System.out.println("Weight: " + delivery3.getWeight());
//        System.out.println("Recipient: " + delivery3.getRecipient());
//    }
//}
