package Methods;

public class Polindrome {
    public static void isPolindrome(String word){
        boolean isPolindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
                isPolindrome = false;
            }
        }
        System.out.println(isPolindrome);
    }

    public static void main(String[] args) {
        isPolindrome("racecaar");
    }
}
