
public class EmailMsgListener implements EventListener {
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("We have emailed you at " + email);
    }

}
