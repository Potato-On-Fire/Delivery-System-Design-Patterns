package Observer;

public class ObserverDriverMain {
    public static void main(String[] args) {
        // Initialize the customer stub
        CustomerNotificationStub customerStub = new CustomerNotificationStub();

        // Initialize NotificationService with the customers from the stub
        NotificationService notificationService = new NotificationService(customerStub.getCustomers());

        // Test notification functionality
        System.out.println("Sending initial notifications:");
        notificationService.notifyCustomers();

        // Subscribe a new customer
        EventListener newEmailListener = new EmailMsgListener("newCustomer@example.com");
        notificationService.subscribe(newEmailListener);
        System.out.println("After subscribing a new customer:");
        notificationService.notifyCustomers();

        // Unsubscribe an existing customer
        notificationService.unsubscribe(customerStub.getCustomers().get(0));
        System.out.println("After unsubscribing the first customer:");
        notificationService.notifyCustomers();
    }
}
