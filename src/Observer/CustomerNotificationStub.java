package Observer;

import java.util.ArrayList;
import java.util.List;

// Stub class to act as a mini database of customers
public class CustomerNotificationStub {
    private List<EventListener> customers;

    public CustomerNotificationStub() {
        customers = new ArrayList<>();
        // Adding sample customers with different notification settings
        customers.add(new EmailMsgListener("customer1@example.com"));
        customers.add(new EmailMsgListener("customer2@example.com"));
        customers.add(new MobileAppListener("UserA"));
        customers.add(new MobileAppListener("UserB"));
    }

    public List<EventListener> getCustomers() {
        return customers;
    }
}

