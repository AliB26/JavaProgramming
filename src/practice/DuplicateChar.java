package practice;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int num = input.nextInt();

        for (int i = 0; i < num; i++){

            str += str.charAt(str.length() - 1);
        }
        System.out.println(str);
    }
}
