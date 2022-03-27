package Methods;

import java.util.Arrays;

public class ourArrayClass {
    public static void printFirstElement(int[] nums){
        System.out.println(nums[0]);
    }
    public static void printLastElement(int[] nums){
        System.out.println(nums[nums.length-1]);
    }
    public static void printAllElements(int[] nums){
        System.out.println(Arrays.toString(nums));
    }
    public static void printMiddleElement(int[] nums){
        if (nums.length % 2 == 0){
            System.out.println("" + nums[nums.length/2-1] + " " + nums[nums.length/2]);
        }else {
            System.out.println("" + nums[nums.length/2]);
        }
    }

    public static void main(String[] args) {
        printFirstElement(new int[] {1, 2, 3, 4, 5});
        printLastElement(new int[] {2, 4, 6});
        printAllElements(new int[] {5, 7, 9, 0});
        printMiddleElement(new int[] {10, 20, 30, 40});
    }
}
