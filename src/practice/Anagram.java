package practice;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();
        boolean isAnagram = false;

        if (str1.length() == str2.length()) {

        for (int i = 0; i < str1.length(); i++) {

            if (str2.contains("" + str1.charAt(i))){
                str2 = str2.replaceFirst(("" + str1.charAt(i)), "");
            }
                }
            }
        if (str2.isBlank()){
            isAnagram = true;
        }
            System.out.println(isAnagram);
        }
    }
