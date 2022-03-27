package practice;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().trim().toLowerCase();
        System.out.println("Enter your last name");
        String lastName = input.next().trim().toLowerCase();

        System.out.println("First name: " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
    }
}
