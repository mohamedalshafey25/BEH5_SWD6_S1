package session7.methodOverriding;

public class Main {
    public static void main(String[] args) {

        Person emp1 = new Person();
        Employee emp2 = new Employee();
        Person emp3 = new Employee();
        Person st1 = new Student();

        emp1.introduce();
        emp2.work();
        emp2.introduce();
        emp3.introduce();
        st1.introduce();


    }
}
