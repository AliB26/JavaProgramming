package Arrays;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num[] = new int[input.nextInt()];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
            if (num[i] == 0){
                continue;
            }else if (num[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: " + even + "\nOdd: " + odd);
    }
}
