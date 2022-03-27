package practice;
import java.util.Scanner;
public class CreatingEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the words");
        String str1 = input.next();
        String str2 = input.next();

        if (str1.length()>=6 && str2.length()>=6){
            System.out.println(str1.substring(0,4)+str2.substring(str2.length()-3));
        } else if (str1.length()<6||str2.length()<6){
            System.out.println("Invalid data");
        }
    }
}
