package session3;

import java.util.Scanner;

public class C1_Switch {
    public static void main(String[] args) {

        String language;
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("For English press 1, For Arabic press 2 \n");

        input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Welcome to the English UI");
                language = "English";
                break;
            case 2:
                System.out.println("مرحبا بك في واجهة المستخدم العربية");
                language = "Arabic";
                break;
            default:
                System.out.println("Invalid input");
                language = "Arabic";
        }


        switch (language) {
            case "English":
                System.out.println("You have selected English");
                break;
            case "Arabic":
                System.out.println("لقد اخترت اللغة العربية");
                break;
            default:
                System.out.println("Invalid language selection");
        }

    }
}
