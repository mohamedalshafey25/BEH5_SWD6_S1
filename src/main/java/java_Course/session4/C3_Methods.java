package java_Course.session4;
import java.lang.Math;
public class C3_Methods {
    public static void main(String[] args) {

        welcomeMessage();
        registerUser("Mohamed", "12345");
        loginUser("Mohamed", "12345");


        System.out.println(Math.max(5, 10));

        // Method call: / usage
        System.out.println(addNumbers(5, 10));

        printMessage("passed message");

        // calling a method from another class
        C4_MethodOverloading.addNumbers(5, 6, 10.5, 11);


    }

    private static void loginUser(String name, String password) {
    }

    private static void registerUser(String name, String password) {
        System.out.println("User " + name + " registered with password: " + password);
    }

    /**
     Method naming convention:
     - Method names should be verbs,
        in mixed case with the first letter lowercase and the first letter of each internal word capitalized.
     - Method names should be descriptive and indicate the action performed
    */
    // Method signature / Method Definition:
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method without parameters
    public static void welcomeMessage() {
        if (timeStamp() < 12) {
            System.out.println("Good Morning!");
        } else if (timeStamp() < 18) {
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Evening!");
        }
        System.out.println("Welcome to the Java Methods Example!");
    }

    private static int timeStamp() {
        return java.time.LocalTime.now().getHour();
    }

    // Method with parameters
    public static void printMessage(String message) {
        System.out.println(message);
    }

}
