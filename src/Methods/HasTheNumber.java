package Methods;

public class HasTheNumber {
    public static void checkArray(int[] nums, int num){
        boolean hasNum = false;
        for (int each: nums) {
            if (each == num){
                hasNum = true;
            }
        }
        System.out.println(hasNum);
    }

    public static void main(String[] args) {
        checkArray(new int[]{1, 2, 4, 5}, 2);
    }
}
