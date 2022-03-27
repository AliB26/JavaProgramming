package ifPractices;

import java.util.Scanner;

public class daysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfMOnth = input.nextInt();

        if ((numberOfMOnth==1)||(numberOfMOnth==3)||(numberOfMOnth==5)||(numberOfMOnth==7)||(numberOfMOnth==8)||(numberOfMOnth==10)||(numberOfMOnth==12)){
            System.out.println("has 31 days");
        }else if (numberOfMOnth==4||numberOfMOnth==6||numberOfMOnth==9||numberOfMOnth==11){
            System.out.println("has 30 days");
        }else if (numberOfMOnth==2){
            System.out.println("has 28 days");
        }else {
            System.out.println("invalid number");
        }
    }
}
