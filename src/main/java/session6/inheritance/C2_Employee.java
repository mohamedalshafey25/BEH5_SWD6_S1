package session6.inheritance;

public class C2_Employee extends C1_Person {

    // Attributes
    int employeeId;
    double salary;

    // Constructor


    // Methods
    public void getSalary(){
        System.out.println("Salary: " + salary);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
