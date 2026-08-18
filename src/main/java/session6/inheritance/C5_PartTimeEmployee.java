package session6.inheritance;

public class C5_PartTimeEmployee extends C2_Employee{

    // Attributes
    int hoursWorked;
    double hourlyRate;

    // Constructor

    // Methods
    public void getPartTimeSalary(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        salary = hoursWorked * hourlyRate;
        System.out.println("Salary: " + salary);
    }
}
