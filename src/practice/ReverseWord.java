package practice;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String reverse = "";

        for (int i=str.length()-1; i>=0;  i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
            System.out.println("It's palindrome");
        }else {
            System.out.println("It's not palindrome");
        }

    }
}