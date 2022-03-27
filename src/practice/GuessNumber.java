package practice;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secret = 56;
        int num = 0;
        int attempt = 0;

        while (num != 56) {
            System.out.println("Enter a number");
            num = input.nextInt();
            System.out.print("Attempt " + ++attempt + ": ");

            if (num < 56) {
                System.out.println("Too low");
            } else if (num > 56) {
                System.out.println("Too high");
            } else {
                System.out.println("You guessed correctly");
            }
        }
    }
}
