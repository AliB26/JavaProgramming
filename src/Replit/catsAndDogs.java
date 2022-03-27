package Replit;

import java.util.Scanner;

public class catsAndDogs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int cntCat = 0;
        int cntDog = 0;
        boolean isSame;

        for (int i = 0; i < str.length(); i++){
            if (str.startsWith("cat", i)){
                cntCat++;
            }else if (str.startsWith("dog", i)){
                cntDog++;
            }
        }
        isSame = cntCat == cntDog && cntCat != 0;
        System.out.println(isSame);
    }
}
