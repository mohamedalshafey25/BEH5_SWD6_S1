package session6.inheritance;

public class C0_Main {
    public static void main(String[] args) {

        // Reference identifier = new Object();
        C1_Person emp1 = new C1_Person();
        C1_Person emp3 = new C2_Employee();

        // Method Overriding
//        emp3.displayInfo();




        // Employee object
        C2_Employee emp2 = new C2_Employee();

        emp2.name = "Ahmed";
        emp2.age = 30;
        emp2.isEgyptian = true;
        emp2.employeeId = 12345;
        emp2.salary = 5000.0;
//        emp2.displayInfo();
//        emp2.getSalary();


        // Student object
        C3_Student st1 = new C3_Student();
        st1.name = "Sara";
        st1.age = 20;
        st1.isEgyptian = false;
        st1.studentId = "S123";
        st1.gpa = 3.8;
//        st1.displayInfo();
//        st1.getGPA();

        // Full Time Employee
        C4_FullTimeEmployee ft1 = new C4_FullTimeEmployee();
        ft1.name= "Mohamed";
        ft1.age = 50;
        ft1.isEgyptian = true;
        ft1.employeeId = 1234;
        ft1.basicSalary = 2000.0;
        ft1.bonus = 500.0;
        ft1.deductions = 100.0;
//        ft1.displayInfo();
//        ft1.getFullTimeSalary();
        ft1.displayInfo();


        // Static Variable (Related to Class not Objects)
        C4_FullTimeEmployee ft2 = new C4_FullTimeEmployee();
        C4_FullTimeEmployee ft3 = new C4_FullTimeEmployee();
        C4_FullTimeEmployee ft4 = new C4_FullTimeEmployee();

//        System.out.println(ft1.count());
//        System.out.println(ft2.count());
//        System.out.println(ft3.count());
//        System.out.println(ft4.count());

        // Part Time Employee
        C5_PartTimeEmployee pt1 = new C5_PartTimeEmployee();



    }
}
