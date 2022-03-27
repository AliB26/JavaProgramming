package practice;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String primeNumber = "";

        for (int i = 2; i <= num; i++){
            int count = 0;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 0){
                primeNumber += i + " ,";
            }
        }
        System.out.println(primeNumber);
    }
}
