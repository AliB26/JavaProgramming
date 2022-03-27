package practice;

import java.util.Scanner;

public class longestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the words");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        if (word1.length()>word2.length()&&word1.length()>word3.length()&&word1.contains("a")){
            System.out.println(word1);
        }else if (word2.length()>word1.length()&&word2.length()>word3.length()&&word2.contains("a")){
            System.out.println(word2);
        }else if (word3.length()>word1.length()&word3.length()>word2.length()&&word3.contains("a")){
            System.out.println(word3);
        }
    }
}
