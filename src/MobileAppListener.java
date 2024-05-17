
public class MobileAppListener implements EventListener {
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update() {
       System.out.println("We have notified user " + username);
    }
}
