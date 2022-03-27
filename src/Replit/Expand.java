package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(Arrays.copyOf(nums, 6)));
    }
}
