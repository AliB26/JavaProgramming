package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"James Bond", "Leo Adam", "Ali Pasha"};

        for (int i = 0; i < names.length; i++)
            System.out.println("" + names[i].substring(0, 1) +
                    names[i].substring(names[i].indexOf(' ')).trim().charAt(0));
    }
}
