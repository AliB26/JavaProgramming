package practice;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number");
        String number = input.next();
        if (number.isEmpty()){
            System.out.println("Empty input given");
        }else if (number.startsWith("2")){
            if (number.length()==7) {
                System.out.println("Valid 7-digit account number");
            }else if (number.length()!=7){
                System.out.println("Invalid 7-digit account number");
            }
        }else if (number.startsWith("5")){
            if (number.length()==10) {
                System.out.println("Valid 5-digit account number");
            }else if (number.length()!=10){
                System.out.println("Invalid 5-digit account number");
            }
        }else {
            System.out.println("Invalid account number");

        }
    }
}
