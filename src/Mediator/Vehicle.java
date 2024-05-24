package Mediator;

// Class representing a Mediator.Vehicle.
public class Vehicle {
    private final String id;
    private boolean isActive;

    // Constructor for Mediator.Vehicle.
    public Vehicle(String id) {
        this.id = id;
        this.isActive = false; // Default to not active.
    }

    // Getter for vehicle ID.
    public String getId() {
        return id;
    }

    // Getter for vehicle's active status.
    public boolean isActive() {
        return isActive;
    }

    // Setter for vehicle's active status.
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}

