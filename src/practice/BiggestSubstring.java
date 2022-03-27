package practice;

import java.util.Scanner;

public class BiggestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String result = "";
        String biggest = "";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            result += str.charAt(i);

            if (str.charAt(i) != str.charAt(i + 1)) {
                if (result.length() > biggest.length()){
                    biggest = result;
                }
                result = "";
            }
        }
        System.out.println(biggest);
    }
}
