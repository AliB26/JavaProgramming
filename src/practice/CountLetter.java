package practice;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int total = 0;

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)=='a'){
                total+=1;
            }
        }
        System.out.println(total);
    }
}
