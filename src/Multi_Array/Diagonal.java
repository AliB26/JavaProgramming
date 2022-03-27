package Multi_Array;

public class Diagonal {
    public static void main(String[] args) {

        int[][] nums = {{3, 5, 1}, {1, 6, 10}, {5, 21, 10}};
        int diagonal = nums.length-1;
        int di2 = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i][di2]);
            di2++;
        }
        System.out.println();
        for (int[] num : nums) {
            System.out.print(num[diagonal]);
            diagonal--;
        }
    }
}
