package Replit;

public class OddandEven {
    public static void main(String[] args) {

        int odd = 0;
        int even = 1;
        String evens = "";
        String odds = "";

        while (even <= 20) {
            if (even % 2 == 0) {
                evens += even + " ";
            }
            even++;
        }
        System.out.print(evens.trim());

        System.out.println();

        while (odd < 20) {
            if (odd % 2 == 1) {
                odds += odd + " ";
            }
            odd++;
        }
        System.out.print(odds.trim());
    }
}
