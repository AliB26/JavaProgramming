package Methods;

public class theNumber {
    public static void checkNumber(int num){
        if (num > 0){
            System.out.println(num + " is positive");
        }else if (num < 0){
            System.out.println(num + " is negative");
        }else {
            System.out.println(num + " is neutral");
        }
    }

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(5);
        checkNumber(-10);
    }
}
