package practice;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = input.nextLine();
        name = name.toLowerCase();

        if (name.startsWith("mr")||name.startsWith("mister")){
            System.out.println("Hello Sir");
        }else if (name.startsWith("ms")||name.startsWith("miss")){
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr")) {
            System.out.println("Hello Doctor");
        } else if (name.endsWith("sr")){
            System.out.println("Nice to meet you Senior");
        }else if (name.endsWith("jr")){
            System.out.println("Nice to meet you Junior");
        }else {
            System.out.println(name);
        }
    }
}
