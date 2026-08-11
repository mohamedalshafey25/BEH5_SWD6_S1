package session7.abstraction;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Employee();
        Person p2 = new Student();

        p1.work();
        p2.work();

        // Person p3 = new Person(); ERROR



    }
}
