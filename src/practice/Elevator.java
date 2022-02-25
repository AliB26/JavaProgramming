package practice;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int floor = input.nextInt();

        switch (floor){
            case 1:
                System.out.println("Lobby, StarBucks, Amazon Pick Up");
                break;
            case 2:
                System.out.println("NASA, Cydeo, Discover");
                break;
            case 3:
                System.out.println("Uber, Lyft, Chase");
                break;
            case 4:
                System.out.println("Rooftop, Lounge");
                break;
            default:
                System.out.println("Invalid Floor Selected");
        }
    }
}
