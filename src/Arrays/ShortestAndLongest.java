package Arrays;

import java.util.Scanner;

public class ShortestAndLongest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] word = new String[input.nextInt()];

        for (int i = 0; i < word.length; i++){
            word[i] = input.next();
        }

        String shortest = word[0];
        String longest = word[0];

        for (String s : word) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("longest = " + longest);
        System.out.println("shortest = " + shortest);
    }
}
