package Methods;

public class CountNums {

    public static void division(int num1, int num2){

        System.out.println(num1 / num2);
    }

    public static void countNums(int num){

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        countNums(10);
        division(5, 2);
    }
}
