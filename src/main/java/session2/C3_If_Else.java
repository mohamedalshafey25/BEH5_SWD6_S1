package session2;

public class C3_If_Else {
    public static void main(String[] args) {

        int age = 20;
        boolean canRegister;

        // if statement
        if (age >= 18) {
            canRegister = true;
            System.out.println("You can register");
            System.out.println("canRegister status: " + canRegister);
        } else {
            canRegister = false;
            System.out.println("You cannot register");
            System.out.println("canRegister status: " + canRegister);
        }
    }

    // if-else if ladder statement
    public static void checkAge(int age) {
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age < 20) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}
