package session7.methodOverriding;

public class Employee extends Person{

    @Override
    public void introduce(){
        System.out.println("I'm an Employee.");
    }

    public void work(){
        System.out.println("I'm working.");
    }
}
