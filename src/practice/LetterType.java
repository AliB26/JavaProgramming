package practice;

import java.util.Scanner;

public class LetterType {
    public static void main(String[] args) {

        char letter = 'T';

        if (letter>=97&&letter<=122){
            System.out.println("lowercase");
        }else if (letter>=65&&letter<=90){
            System.out.println("uppercase");
        }
    }
}
