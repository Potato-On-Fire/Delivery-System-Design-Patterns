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
    public static Depot getInstance(int index) {
        if (index < 0 || index >= MAX_INSTANCES) {
            throw new IllegalArgumentException("Index is out of range.");
        }

        synchronized (Depot.class) {
            if (instances[index] == null) {
                instances[index] = new Depot(new Address(), 10); // Assuming default capacity.
                instanceCount++;
            }
        }

        return instances[index];
    }

    public static Depot getInstance() {
        return getInstance(0); // Default to the first instance if no index is provided.
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
    public boolean hasSpace() {
        return currentVehicles < vehicleCapacity;
    }

}
