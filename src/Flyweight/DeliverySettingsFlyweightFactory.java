package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeliverySettingsFlyweightFactory {
    private static final Map<DeliverySettingsFlyweight, DeliverySettingsFlyweight> flyweights = new HashMap<>();

    public static DeliverySettingsFlyweight getFlyweight(String deliveryType, String packagingType, String priority, String vehicleType,String sizeCategory) {
        DeliverySettingsFlyweight temp = new DeliverySettingsFlyweight(deliveryType, packagingType, priority, vehicleType,sizeCategory);
        DeliverySettingsFlyweight flyweight = flyweights.get(temp);

        if (flyweight == null) {
            flyweights.put(temp, temp);
            flyweight = temp;
        }
        return flyweight;
    }
    // This method is added for testing purposes to check the size of the flyweights map
    public static int getFlyweightsCount() {
        return flyweights.size();
    }
}
