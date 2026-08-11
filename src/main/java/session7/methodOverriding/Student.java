package session7.methodOverriding;

public class Student extends Person{

    @Override
    public void introduce(){
        System.out.println("I'm a Student.");
    }
}
