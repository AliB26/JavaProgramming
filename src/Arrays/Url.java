package Arrays;

public class Url {
    public static void main(String[] args) {

        String url = "https://learn.cydeo.com/courses/130";
        String[] element = url.split("/");

        for (String each: element) {
            System.out.println(each);
        }
    }
}
