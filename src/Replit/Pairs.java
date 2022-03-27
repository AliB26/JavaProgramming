package Replit;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[4];
        for (int i=0;i<4;i++){
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i] + ", " + arr[i + 1]);
        }
    }
}
