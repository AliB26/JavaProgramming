package Replit;

public class Alphabet {
    public static void main(String[] args) {

        char upperCase = 'A';
        char lowerCase = 'z';

        while (upperCase <= 'Z') {
            System.out.print(upperCase++);
        }
        System.out.println();

        while (lowerCase >= 'a') {
            System.out.print(lowerCase--);
        }
    }
}
