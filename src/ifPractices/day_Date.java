package ifPractices;

import java.util.Scanner;

public class day_Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp = input.nextInt();

        if (temp>=70&&temp<=80) {
            System.out.println("Ideal Temp");
        }

        int a;
        int b = 50;
        int c = 102;

        if (b==50&&c>100){
            a = 20;
            System.out.println(a);
        }
    }
}
