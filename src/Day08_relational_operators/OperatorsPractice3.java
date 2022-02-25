package Day08_relational_operators;

public class OperatorsPractice3 {

    public static void main(String[] args) {

        int h = 5;
        int p = h;

        h++;

        System.out.println(h);
        System.out.println(p);

        int k = h++;

        System.out.println(h);
        System.out.println(k);

        int g = ++h;

        System.out.println(h);
        System.out.println(g);
    }
}
