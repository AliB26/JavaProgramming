package Arrays;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String name = input.next();
        char[] letters = name.toCharArray();
        System.out.println("" + letters[0] + letters[letters.length-1]);
    }
}
