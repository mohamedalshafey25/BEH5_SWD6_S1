package java_Course.session5;

public class C1_TrainingCompany {

    // Attributes
    String name;
    String address;
    int capacity;
    boolean availability;

    // Constructors

        // Default constructor
    public C1_TrainingCompany() {
        System.out.println("Default constructor called");
    }

        // Parameterized constructor
    public C1_TrainingCompany(String name, String address,int capacity,boolean availability){
        // Initialize attributes with provided values
        this.name = name;
        this.address= address;
        this.capacity = capacity;
        this.availability = availability;



    }

    public C1_TrainingCompany(String name) {

        this.name= name;
    }

    public C1_TrainingCompany(String name, String address) {

        this.name= name;
        this.address= address;
    }




    // Methods
    public void displayCompanyInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Capacity: " + capacity);
        System.out.println("Availability: " + availability);
    }

    public void teachCourse(String courseName) {
        System.out.println("Teaching course: " + courseName);
    }


}
