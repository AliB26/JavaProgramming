package practice;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String genre = input.next();

        int pageLength = 0;
        int sequel = 0;
        int country = 0;
        int profit = 0;
        switch (genre) {
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequel = 5;
                country = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequel = 3;
                country = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequel = 4;
                country = 30;
                break;
        }
        System.out.println("Genre " + genre + ", page length " + pageLength + ", profit " + profit + ", sequels " + sequel + ", countries " + country);
    }
}
