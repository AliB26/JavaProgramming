package Replit;

import java.util.Scanner;

public class Hashtag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        int hashtag = 1;

        while (hashtag++ <= n) {
            System.out.print("#");
        }
    }
}
