package java_Course.session5;

public class C2_Encapsulation {
    // Attributes
    private String name;
    private int capacity;

    // Getter methods for name and address
    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }

    // setter methods for name and capacity
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. It cannot be null or empty.");
        }
        this.name = name;
    }
    public void setCapacity(int capacity) {
        if (capacity > 0 && capacity <= 1000) {
            this.capacity = capacity;
        } else {
            System.out.println("Invalid capacity. It must be between 1 and 1000.");
        }
    }

}
