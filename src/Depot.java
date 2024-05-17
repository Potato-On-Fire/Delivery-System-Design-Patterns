//Depot class implementation using Singleton design pattern.
public class Depot {
    private static final int MAX_INSTANCES = 2;
    private static final Depot[] instances = new Depot[MAX_INSTANCES];
    private static volatile int instanceCount = 0;
    private Address location;

    private Depot(Address add) {
        this.location = add;
    }

    public static Depot getInstance() {
        int index = instanceCount % MAX_INSTANCES;
        Depot result = instances[index];

        if (result == null) {
            synchronized (Depot.class) {
                result = instances[index];
                if (result == null) {
                    result = new Depot(new Address());
                    instances[index] = result;
                    instanceCount++;
                }
            }
        }
        return result;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
}
