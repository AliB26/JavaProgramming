package Methods;

public class CreditScore {
    public static int getCreditScore(){
        return 800;
    }
    public static boolean isGood(int score){
        if (score >= 700){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isGood(700));
        System.out.println(isGood(getCreditScore()));
    }
}
