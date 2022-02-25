package practice;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nameOfMonth = input.next();

        switch (nameOfMonth){
            case "February":
                System.out.println("28 days");
                break;
            case "April":
                System.out.println("30 days");
                break;
            case "June":
                System.out.println("30 days");
                break;
            case "September":
                System.out.println("30 days");
                break;
            case "November":
                System.out.println("30 days");
                break;
            case "January":
                System.out.println("31 days");
                break;
            case "March":
                System.out.println("31 days");
                break;
            case "May":
                System.out.println("31 days");
                break;
            case "July":
                System.out.println("31 days");
                break;
            case "August":
                System.out.println("31 days");
                break;
            case "October":
                System.out.println("31 days");
                break;
            case "December":
                System.out.println("31 days");
                break;
            default:
                System.out.println("invalid");
                break;

        }
    }
}
