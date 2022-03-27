package Arrays;

import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] names = new String[input.nextInt()];
        int [] scores = new int[names.length];
        char [] grades = new char[names.length];
        int order = 0;

        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        for (int i = 0; i < grades.length; i++) {
            if (scores[order] >= 85){
                grades[i] = 'A';
            }else if (scores[order] >= 75){
                grades[i] = 'B';
            }else if (scores[order] >= 65){
                grades[i] = 'C';
            }else {
                grades[i] = 'D';
            }order++;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("" + names[i] + "|" + scores[i] + "|" + grades[i]);
        }
    }
}
