package java_Course.session4;

public class C4_MethodOverloading {

    public static void main(String[] args) {

        addNumbers(5,6);

    }
    
    public static int addNumbers(int a, int b) {
        // Method overloading: same method name, different parameter list
        System.out.println("Adding two integers: " + a + " and " + b);
        // 
        return a + b;
    }

    public static int addNumbers(int a, int b, int c) {
        // Method overloading: same method name, different parameter list
        System.out.println("Adding three integers: " + a + ", " + b + ", and " + c);
        return b + a + c;
    }

    public static double addNumbers(int a, int b, double c) {
        // Method overloading: same method name, different parameter list
        System.out.println("Adding two integers and a double: " + a + ", " + b + ", and " + c);
        return b + a + c;
    }

    public static void addNumbers(int i, int i1, double v, int i2) {
    }
}
