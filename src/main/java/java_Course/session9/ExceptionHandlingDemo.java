package java_Course.session9;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        // Arithmetic Exception
        System.out.println("hello!");
        int x= 10;
        int y = 0;

        try {
            System.out.println("before exception statement");
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
            System.out.println(e.getMessage());
        } finally {                                             // will be run always
            System.out.println("Finally, goodbye!");
        }
        System.out.println("End");

        // NullPointerException
        String name = null;
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Name is null");
        }
        System.out.println("End");

        int[] numbers = {10,20,30};
        System.out.println(numbers[6]);

    }
}
