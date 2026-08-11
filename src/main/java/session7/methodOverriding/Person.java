package session7.methodOverriding;

import java.security.PublicKey;

public class Person {

    String name;
    int age;

    public Person(String name, int age){
        System.out.println("Person constructor called.");
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }


    public void introduce(){
        System.out.println("I'm a Person.");
    }
}
