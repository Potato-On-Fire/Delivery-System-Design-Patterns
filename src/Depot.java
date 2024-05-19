// Class representing a Depot with a maximum of 2 instances allowed (Singleton pattern with a twist).
public class Depot {
    public static final int MAX_INSTANCES = 2;
    private static final Depot[] instances = new Depot[MAX_INSTANCES];
    private static volatile int instanceCount = 0;
    private Address location;
    private int vehicleCapacity;
    private int currentVehicles;

    // Private constructor to prevent direct instantiation.
    private Depot(Address add, int capacity) {
        this.location = add;
        this.vehicleCapacity = capacity;
        this.currentVehicles = 0;
    }

    // Method to get an instance of the Depot.
    public static Depot getInstance() {
        int index = instanceCount % MAX_INSTANCES;
        Depot result = instances[index];

        if (result == null) {
            synchronized (Depot.class) {
                result = instances[index];
                if (result == null) {
                    result = new Depot(new Address(), 10); // Assuming default capacity.
                    instances[index] = result;
                    instanceCount++;
                }
            }
        }
        return result;
    }

    // Getter for location.
    public Address getLocation() {
        return location;
    }

    // Setter for location.
    public void setLocation(Address location) {
        this.location = location;
    }

    // Method to enter a vehicle into the depot.
    public boolean enterVehicle() {
        if (currentVehicles < vehicleCapacity) {
            currentVehicles++;
            return true;
        }
        return false;
    }

    // Method to exit a vehicle from the depot.
    public boolean exitVehicle() {
        if (currentVehicles > 0) {
            currentVehicles--;
            return true;
        }
        return false;
    }
}
