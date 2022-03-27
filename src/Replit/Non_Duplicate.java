package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Non_Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int non_duplicate = nums[0];
        for (int i = 1; i < nums.length-1; i++) {

            if (non_duplicate == nums[i]){
                non_duplicate = nums[i+1];
                i+=1;
            }
        }
        System.out.println(non_duplicate);
    }
}
