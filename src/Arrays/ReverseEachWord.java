package Arrays;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] words = str.split(" ");
        String reversed = "";

        for (String word: words) {
            for (int i = word.length()-1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            reversed += " ";
        }
        System.out.println(reversed);
    }
}
