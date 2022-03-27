package practice;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(++i) == 'i') {
                    count++;
                }
            }
        System.out.println(count);
    }
}
