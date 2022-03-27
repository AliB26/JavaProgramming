package practice;

import java.util.Scanner;

public class HotelDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many days will you stay at the hotel?");
        int days = input.nextInt();
        System.out.println("How many people are in your party?");
        int partySize = input.nextInt();
        String roomType = null;
        int price = 0;
        boolean isAvailable = true;

        switch (partySize){
            case 1:
                roomType = "Single room";
                price = days * 100;
                break;
            case 2:
                roomType = "Double room";
                price = days * 125;
                break;
            case 3:
            case 4:
                roomType = "Large room";
                price = days * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "Suite";
                price = days * 500;
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
                isAvailable = false;
                break;
        }

        if (isAvailable){
            System.out.println("Your room type is: " + roomType + "\nTotal price is: " + price);
        }
    }
}
