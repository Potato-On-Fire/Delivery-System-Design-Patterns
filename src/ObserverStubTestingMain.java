import java.util.ArrayList;
import java.util.List;

public class ObserverStubTestingMain {
    public static void main(String[] args) {
        // Create a list to hold the customers
        List<EventListener> customers = new ArrayList<>();

        // Create some email and mobile listeners
        EmailMsgListener emailListener1 = new EmailMsgListener("user1@example.com");
        EmailMsgListener emailListener2 = new EmailMsgListener("user2@example.com");
        MobileAppListener mobileListener1 = new MobileAppListener("user3");
        MobileAppListener mobileListener2 = new MobileAppListener("user4");

        // Create the notification service and add listeners
        NotificationService notificationService = new NotificationService(customers);

        // Subscribe listeners
        notificationService.subscribe(emailListener1);
        notificationService.subscribe(emailListener2);
        notificationService.subscribe(mobileListener1);
        notificationService.subscribe(mobileListener2);

        // Send out notifications to all subscribed customers
        System.out.println("Sending notifications to all subscribed customers:");
        notificationService.notifyCustomers();

        // Unsubscribe one email listener and one mobile listener
        notificationService.unsubscribe(emailListener2);
        notificationService.unsubscribe(mobileListener1);

        // Send out notifications again, should only reach the remaining subscribed customers
        System.out.println("Sending notifications to remaining subscribed customers after unsubscription:");
        notificationService.notifyCustomers();
    }
}
