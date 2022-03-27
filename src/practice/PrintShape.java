package practice;

public class PrintShape {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 8; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print("* ");
                }
            num++;
                System.out.println();
            }
    }
}
