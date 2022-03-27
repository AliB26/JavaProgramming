package practice;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int monthNumber = input.nextInt();

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("It is winter, so wear a winter coat, gloves and a hat");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring, so wear a spring jacket");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer, so wear a T-shirt and short");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is fall, so wear a autumn coat and take a umbrella");
                break;
        }
    }
}