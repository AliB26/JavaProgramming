package Replit;

import java.util.Scanner;

public class SecondElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Second element: " + nums[1] + "\nSecond to last element: " + nums[nums.length-2]);
    }
}
