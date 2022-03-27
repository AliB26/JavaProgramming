package practice;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();
        int count = 1;

        for (int i = sentence.indexOf(' '); i<sentence.length(); i++){
            if (sentence.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
