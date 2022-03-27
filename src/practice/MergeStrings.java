package practice;

import java.util.Scanner;

public class MergeStrings {
    public static void main(String[] args) {

        String st1 = "ali";
        String st2 = "ban";
        String result="";
        for (int i = 0; i < st1.length(); i++) {
            result+=st1.charAt(i);
            result+=st2.charAt(i);
        }
        System.out.println(result);

    }
}
