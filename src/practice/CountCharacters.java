package practice;

import java.util.Locale;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int lowerCase = 0;
        int upperCase = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                number++;
            } else if (str.charAt(i) == str.toUpperCase().charAt(i)) {
                upperCase++;
            } else {
                lowerCase++;
            }
        }
        System.out.println(upperCase + " uppercase letters" + "\n" + lowerCase + " lowercase letters"
            + "\n" + number + " numbers");
    }
}

