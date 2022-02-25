import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        double price = 0;

        if (screenSize == 13.3) {
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else if (screenSize == 17.3) {
            price += 400;
        }
        System.out.println("Select CPU type:");
        String cpuType = input.next();

        switch (cpuType) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
        }
        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();

        if (ramSize % 4 == 0) {
            price = price + 50 * (ramSize / 4);
        }
        System.out.println("Select storage type:");
        String storageType = input.next();
        System.out.println("Select storage size:");
        int storageSize = input.nextInt();

        switch (storageType){
            case "HDD":
                price = price + 50 * (storageSize / 500);
                break;
            case "SSD":
                price = price + 100 *(storageSize / 500);
                break;
        }
        System.out.println("Select screen resolution:");
        String screen = input.next();

        switch (screen){
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
                break;
        }

        System.out.println("Laptop price is: $"+price);


    }
}