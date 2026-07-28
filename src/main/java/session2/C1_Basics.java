package session2;

public class C1_Basics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // This is a single-line comment

        /*
         * This is a multi-line comment
         * It can span multiple lines
         */

        // Variables
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 10.5f;
        double d = 10.5;
        char c = 'A';
        boolean bool = true;

        // Constants
        final double PI = 3.14159;

        int x; // declaration without initialization
        x = 5; // initialization

        System.out.println(x);

        // Reference types
        String name = "Mohamed";
        System.out.println(name);

        // unary operators
        int a = 5;
        System.out.println(a++); // prints 5, then increments a to 6
        System.out.println(++a); // increments a to 7, then prints 7


        // relational operators
        int num1 = 10;
        int num2 = 20;
        boolean isN1LessN2 = num1 < num2; // true

        System.out.println(isN1LessN2); // true
        System.out.println(num1==num2); // false

        // Logical operators
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue && isFalse); // false
        System.out.println(isTrue || isFalse); // true



    }


}
