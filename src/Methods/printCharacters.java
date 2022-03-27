package Methods;

public class printCharacters {
    public static void theWord(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void main(String[] args) {
        theWord("Ali");
    }
}
