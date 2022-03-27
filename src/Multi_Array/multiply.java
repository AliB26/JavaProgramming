package Multi_Array;

import java.util.Arrays;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] nums1 =  new int[3][];
        int [][ ] nums2 = new int[nums1.length][];
        int [][] result = new int [nums1.length][];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                nums1[i][j] = input.nextInt();
            }
            for (int j = 0; j < nums2.length; j++) {
                nums2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < result.length;i++){
            for (int j = 0; j<3; j++){
                result[i][j]= nums1 [i][j]   *     nums2 [i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
