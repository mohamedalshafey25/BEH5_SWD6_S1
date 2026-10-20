package java_Course.session7.methodOverriding;

public class Employee extends Person{

    String employeeID;

    public Employee(String name, int age, String employeeID){

        super(name, age);
        this.employeeID = employeeID;
        System.out.println("Employee constructor called.");
    }




    @Override
    public void introduce(){
        System.out.println("I'm an Employee.");
    }

    public void work(){
        System.out.println("I'm working.");
    }
}
