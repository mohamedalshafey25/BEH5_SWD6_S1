package session2;

import java.util.Scanner;

public class C2_Input {
    public static void main(String[] args) {
        // taking input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); // Read user input (name)

        System.out.println("Enter your age:");
        int age = scanner.nextInt(); // Read user input (age)

//        System.out.println("Hello " + name+ ", Age = " + age);

        System.out.printf("Hello %s , Age = %d \n", name, age);

        boolean canRegister;

        // conditional statements

        // if statement

        if (age >= 18) {
            canRegister = true;
            System.out.println("You can register");
            System.out.println("canRegister status" + canRegister);
        } else {
            canRegister = false;
            System.out.println("You cannot register");
            System.out.println("canRegister status" + canRegister);

        }
        // End

    }
}
