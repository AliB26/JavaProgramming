package practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        while (num <= 50) {
            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (num % 3 == 0){
                System.out.println("Fizz");
            }else if (num % 5 == 0){
                System.out.println("Buzz");
            }
            num++;
        }
    }
}
