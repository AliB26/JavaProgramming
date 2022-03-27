package Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

        String [] strs = {"java", "longer word", "civi", "apple", "raceca", "mon", "annam"};
        String longest = "";
        String word = "";

        for (String str: strs) {
            for (int i = str.length() - 1; i >= 0; i--) {
                word += "" + str.charAt(i);
            }
            if (str.equals(word)){
                if (str.length() > longest.length()){
                    longest = str;
                }
            }
            word = "";
        }
        if (longest.isEmpty()){
            System.out.println("No palindrome");
        }else {
            System.out.println(longest);
        }
    }
}
