package practice;

import java.util.Scanner;

public class Createmail {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        String email = input.next();

        //WRITE YOUR CODE BELOW
        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('_') + 2).toUpperCase()
                + email.substring(email.indexOf('_') + 2, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1, email.indexOf('@') + 2).toUpperCase()
                + email.substring(email.indexOf('@') + 2, email.indexOf('.'));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

    }
}
