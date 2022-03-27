package Arrays;

import java.util.Scanner;

public class TesT {
    public static void getAge(int birthYear) {
        System.out.println("Age: " + (2022 - birthYear));
    }


    public static void CalculateAge() {
        Scanner input = new Scanner(System.in);
        int birthYear = input.nextInt();
        int age = 2022 - birthYear;
        System.out.println(age);
    }

    public static void main(String[] args) {
        getAge(1998);
        int birtYear = 1990;
        getAge(birtYear);
        }
    }

