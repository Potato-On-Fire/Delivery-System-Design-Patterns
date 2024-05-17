import java.util.ArrayList;
import java.util.List;

// Notification service class using the Observer design pattern
public class NotificationService {
    private final List<EmailMsgListener> customers;

    public NotificationService(List<EmailMsgListener> customers) {
        this.customers = new ArrayList<>();
    }

    public void subscribe(EmailMsgListener listener) {
        customers.add(listener);
    }

    public void unsubscribe(EmailMsgListener listener) {
        customers.remove(listener);
    }

    public void notifyCustomers() {
        customers.forEach(listener -> listener.update());
        System.out.println("Notifications sent\n");
    }
}
