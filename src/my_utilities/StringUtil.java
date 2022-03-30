package my_utilities;

import java.util.Locale;

public class StringUtil {
    public static String properFormat(String str){
        str = str.toLowerCase();
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public static String camelCase(String sentence){
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                sentence = sentence.substring(0, i) + sentence.substring(i + 1, i + 2).toUpperCase()
                        + sentence.substring(i + 2);
            }
        }
        return sentence;
    }

    public static int frequency(String word, char chr){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == chr){
                count++;
            }
        }
        return count;
    }

    public static String uniqueChars(String word){
        String uniques = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))){
                uniques += word.charAt(i);
            }
        }
        return uniques;
    }
    public static String duplicateChars(String word){
        String duplicate = "";
        for (int i = 0; i < word.length(); i++) {
            if (!(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i)))
                    && !duplicate.contains(""+word.charAt(i))){
                duplicate += word.charAt(i);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        System.out.println(properFormat("jaMES"));
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
        System.out.println(frequency("apple", 'o'));
        System.out.println(uniqueChars("aabcccccdeeeee"));
        System.out.println(duplicateChars("aabcccccdeeeee"));
    }
}
