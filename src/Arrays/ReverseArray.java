package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[input.nextInt()];
        int[] reverseNum = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(num));

        int j = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            reverseNum[j] = num[i];
            j++;
        }
        System.out.println(Arrays.toString(reverseNum));
    }
}
