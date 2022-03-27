package practice;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = input.next();
        System.out.println("Enter the password");
        String password = input.next();
        boolean a = password.length() >= 5;
        boolean b = password.contains(userName);

        if (a&&!b){
            System.out.println("You're logged in");
        }else if (!a){
            System.out.println("Password cannot be less than 5 characters");
        }else if (b){
            System.out.println("Invalid password, username should not be in it");
        }
    }
}
