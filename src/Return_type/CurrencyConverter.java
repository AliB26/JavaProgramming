package Return_type;

import java.util.Scanner;

public class CurrencyConverter {
    public static double converted(String type, double amount){
        /*
1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee
         */

        switch (type){
            case "euro":
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 14.85;
            case "won":
                return amount * 1217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(converted(input.next(), input.nextDouble()));
    }
}
