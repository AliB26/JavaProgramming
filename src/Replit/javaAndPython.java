package Replit;

import java.util.Scanner;

public class javaAndPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        boolean isSame;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.startsWith("java", i)) {
                count1++;
            } else if (sentence.startsWith("python", i)) {
                count2++;
            }
        }
        isSame = count1 == count2;
        System.out.println(isSame);
    }
}
