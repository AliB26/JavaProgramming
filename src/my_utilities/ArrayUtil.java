package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
    public static int biggestNum(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
    public static boolean isContain(int[] nums, int num){
        for (int each: nums) {
            if (each == num){
                return true;
            }
        }
        return false;
    }
    public static int[] addElement(int[] nums, int num){
        int[] fixed = Arrays.copyOf(nums, nums.length + 1);
        fixed[fixed.length - 1] = num;
        return fixed;
    }

    public static void main(String[] args) {
        System.out.println(biggestNum(new int[]{1, 0, 3, 9, 2}));
        System.out.println(isContain(new int[]{1, 2, 3, 4, 5}, 0));
        System.out.println(Arrays.toString(addElement(new int[]{1, 2, 3}, 5)));
    }
}
