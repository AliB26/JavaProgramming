package Day08_relational_operators;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //WRITE YOUR CODE BELOW
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        if (number % 2 != 0) {
            System.out.println(number + " is odd");
        }
    }
}