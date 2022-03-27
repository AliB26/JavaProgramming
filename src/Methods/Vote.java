package Methods;

public class Vote {
    public static void eligible(int age){
        boolean isEligible = age >= 18;
        System.out.println(isEligible);
    }
    public static void main(String[] args) {
        eligible(25);

    }
}
