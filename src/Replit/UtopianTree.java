package Replit;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {

        int year = 1;
        int growth = 1;
        int treeSize = 0;

        do {
            if (year>3){
                growth = 2;
                treeSize += growth;
            }else {
                treeSize += growth;
            }
            System.out.println("year " + year + " - growth " + growth + "\ntree size: " + treeSize);
            year++;
        }
        while (year<=10);
    }
}
