package Day08_relational_operators;

public class AllOperators {
    public static void main(String[] args) {


        System.out.println(5 + 3 * 2);
        System.out.println(5 * 2 + 4 / 2);
        System.out.println(5 + 2 > 4 - 3);

        System.out.println("------------------------");

        String str = "Wooden Spoon";


        int str1 = str.length();

        System.out.println("str1 = " + str1);

        System.out.println("------------------------");

        String str2 = "JavA";
        System.out.println(str2.toUpperCase());

        System.out.println("------------------------");

        String st3 = "Wooden Spoon";
        st3 = st3.replace('o', 'e');
        System.out.println(st3);
        
    }
}
