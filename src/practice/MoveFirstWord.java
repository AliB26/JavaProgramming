package practice;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and" +
                "problem solving}";

        System.out.println("Sender: " + msg.substring(msg.indexOf('<')+1, msg.indexOf('>')) + "\nNumber: "
                + msg.substring(msg.indexOf('[')+1, msg.indexOf(']')) + "\nMessage: "
                + msg.substring(msg.indexOf('{')+1, msg.indexOf('}')));
    }
}
