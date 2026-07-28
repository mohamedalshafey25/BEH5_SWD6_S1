package session3;

import java.util.Scanner;

public class C3_While_Loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enteredPassword = 0;
        int registeredPassword = 1234;
        while (enteredPassword != registeredPassword) {
            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextInt();
        }

        System.out.println("Password is correct. Access granted.");



        // do while loop
        int x = 10;
        do {
            System.out.println(x);
            x--;
        } while (x>0);




    }




}
