package Methods;

public class sumOfNums {
    public static void checkEquals(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        if (sum == 180){
            System.out.println("This is a triangle");
        }else if (sum == 360){
            System.out.println("This is a circle");
        }else {
            System.err.println("Not valid numbers");
        }
    }

    public static void main(String[] args) {
        checkEquals(90, 90, 45);
        checkEquals(90, 90, 0);
    }
}
