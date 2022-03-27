package Replit;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int m = 1;
        while (n > 1) {
            m *= n--;
        }
        System.out.println("" + m);
    }
}