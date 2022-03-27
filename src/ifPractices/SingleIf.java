package ifPractices;

import java.util.Scanner;

public class SingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n % 2 == 0 && n % 3 == 0 && n % 5 == 0) {
            System.out.println("CodilityTestCoders");
        } else if (n % 2 == 0 && n % 3 == 0) {
            System.out.println("CodilityTest");
        } else if (n % 2 == 0 && n % 5 == 0) {
            System.out.println("CodilityCoders");
        } else if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("TestCoders");
        } else if (n % 2 == 0) {
            System.out.println("Codility");
        } else if (n % 3 == 0) {
            System.out.println("Test");
        } else if (n % 5 == 0) {
            System.out.println("Coders");
        } else {
            System.out.println("Invalid number");
        }
    }
}
