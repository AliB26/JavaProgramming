package Methods;

import java.util.Arrays;

public class arrayNumbers {
    public static void evenAndOdd(int[] nums){
        int[] evenAndOdd = new int[2];
        for (int num: nums){
            if (num % 2 == 0){
                evenAndOdd[0]++;
            }else {
                evenAndOdd[1]++;
            }
        }
        System.out.println(Arrays.toString(evenAndOdd));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        evenAndOdd(new int[]{1, 2, 4});

    }
}
