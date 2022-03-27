package practice;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                continue;
            }
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
