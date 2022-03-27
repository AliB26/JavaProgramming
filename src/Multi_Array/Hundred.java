package Multi_Array;

import java.util.Arrays;

public class Hundred {
    public static void main(String[] args) {

        int[][] nums = new int[10][10];
        int order = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = order++;
            }
        }

        for (int[] num: nums) {
            for (int each: num) {
                System.out.print(each + "\t\t");
            }
            System.out.println();
        }
    }
}
