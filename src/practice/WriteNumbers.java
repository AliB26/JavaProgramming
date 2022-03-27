package practice;

import java.util.Scanner;

public class WriteNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int max = 0;
        int min = 0;

        while (count++ < 5) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (count == 1){
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Biggest number is " + max + "\nSmallest number is " + min);
    }
}
