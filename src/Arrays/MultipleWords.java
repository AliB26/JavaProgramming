package Arrays;

public class MultipleWords {
    public static void main(String[] args) {

        String strs = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] str = strs.split(", ");
        String multiple = "";

        for (String each: str) {
            if (each.contains(" ")){
                System.out.println(each);
            }
        }
    }
}
