package practice;

import java.util.Scanner;

public class GoogleSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String result = "About 640,000,000 results (0.78 seconds)";
        System.out.println("Result number is " + result.substring(result.indexOf(" ")+1, result.indexOf(" r"))
        + "\nResponse time is " + result.substring(result.indexOf("(")+1, result.indexOf(")")));
    }
}
