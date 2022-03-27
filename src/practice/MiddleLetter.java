package practice;

import java.util.Scanner;

public class MiddleLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();

        if (word.length()%2==0){
            System.out.println(""+word.charAt((word.length()-1)/2)+word.charAt((word.length()-1)/2 +1));
        }else {
            System.out.println(word.charAt(word.length()/2));
        }
    }
}
