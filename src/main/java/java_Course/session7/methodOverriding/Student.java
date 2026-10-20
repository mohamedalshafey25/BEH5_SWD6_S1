package java_Course.session7.methodOverriding;

public class Student extends Person{

    String studentID;

    public Student(String name, int age, String studentID ){
        super(name, age);
        this.studentID = studentID;
        System.out.println("Student constructor called.");

    }

    public Student(String name){
        super(name);
    }

    @Override
    public void introduce(){
        System.out.println("I'm a Student.");
    }
}
