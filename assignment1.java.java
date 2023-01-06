import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NU Student email address: ");
        String email = sc.nextLine();

        if (email.matches("elizerponiojr@students.national-u.edu.ph") && email.endsWith("@students.national-u.edu.ph")) {
            System.out.println("Valid NU Student email address");
        } else {
            System.out.println("Invalid NU Student email address");
        }

        System.out.println("Enter Philippine mobile phone number: ");
        String phoneNumber = sc.nextLine();

        if (phoneNumber.matches("09123456789")) {
            System.out.println("Valid Philippine mobile phone number");
        } else {
            System.out.println("Invalid Philippine mobile phone number");
        }
    }
}

