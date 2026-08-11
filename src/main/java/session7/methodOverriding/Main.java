package session7.methodOverriding;

public class Main {
    public static void main(String[] args) {

        Person emp1 = new Person("Mohamed", 30);
        Employee emp2 = new Employee("Ahmed", 25, "A1");
        Person emp3 = new Employee("Sayed", 35, "B1");
        Person st1 = new Student("Hany", 26, "B5");
        Person st2 = new Student("Kom Hamada Guy");

        emp1.introduce();
        emp2.work();
        emp2.introduce();
        emp3.introduce();
        st1.introduce();


    }
}
