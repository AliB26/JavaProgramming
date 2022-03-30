package Methods;

public class numberWords {
    public static String numberAsWord(int num){
        String [] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        return words[num-1];
    }

    public static void main(String[] args) {
        System.out.println(numberAsWord(5));
    }
}
