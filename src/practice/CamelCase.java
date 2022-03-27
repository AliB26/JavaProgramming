package practice;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().toLowerCase();
        String result = str.substring(0,1);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i - 1) == ' '){
                result += ("" + str.charAt(i)).toUpperCase();
            }else {
                result += str.charAt(i);
            }
        }
        System.out.println(result.replace(" ", ""));
    }
}
