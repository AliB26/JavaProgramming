package practice;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String result = "";

        for (int i = 0; i < str.length(); i++ ){

            if (!result.contains("" + str.charAt(i))){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
