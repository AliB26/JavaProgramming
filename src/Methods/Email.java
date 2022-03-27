package Methods;

public class Email {
    public static void buildEmail(String name, String domain){
        System.out.println("Email: " + name.charAt(0) + name.charAt(name.length() - 1) + "22@" + domain + ".com");
    }

    public static void main(String[] args) {
        buildEmail("Tamerlan", "gmail");
    }
}
