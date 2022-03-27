package practice;

import java.util.Scanner;

public class Syllable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int syllable = 1;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '-'){
                syllable++;
            }
        }
        System.out.println(syllable);
    }
}
