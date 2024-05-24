package Observer;

import java.util.ArrayList;
import java.util.List;

// Notification service class using the Observer design pattern
public class NotificationService {
    private final List<EventListener> customers;

    public NotificationService(List<EventListener> customers) {
        this.customers = new ArrayList<>();
    }

    public void subscribe(EventListener listener) {
        customers.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        customers.remove(listener);
    }

    public void notifyCustomers() {
        customers.forEach(listener -> listener.update());
        System.out.println("Notifications sent\n");
    }
}
