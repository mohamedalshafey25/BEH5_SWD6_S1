package session6.inheritance;

public class C4_FullTimeEmployee extends C2_Employee{

    // Attributes
    double basicSalary;
    double bonus;
    double deductions;
    static int ftCounter;

    // Constructor

    // Methods
    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println(basicSalary);
        System.out.println(bonus);
        System.out.println(deductions);

    }

    public void getFullTimeSalary(){
        System.out.println("Basic Salary: "+ basicSalary );
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
        salary = basicSalary + bonus - deductions;
        System.out.println("Salary : " + salary);
    }

    public int count(){
        return ++ftCounter;
    }
}
