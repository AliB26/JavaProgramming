package practice;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String address = input.nextLine().toUpperCase().trim();
        String side;
        String message= "";

        if (address.contains("500")) {
            side = "right";
            message = address + "\nhouse on the " + side + " side";
            if (address.contains("AVE")) {
                message += "\nhouse on avenue";
            } else if (address.contains("LANE")) {
                message += "\nhouse on lane";
            } else if (address.contains("DRIVE")) {
                message += "\nhouse on drive";
            }
        } else if (address.contains("600")) {
            side = "left side";
            if (address.contains("AVE")) {
                message = address + "\nhouse on the " + side + "\nhouse on ave";
            } else if (address.contains("LANE")) {
                message += address + "\nhouse on the " + side + "\nhouse on lane";
            } else if (address.contains("DRIVE")) {
                message += address + "\nhouse on the " + side + "\nhouse on drive";
            }
        }
        System.out.println(message);
    }
}