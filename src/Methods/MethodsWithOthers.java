package Methods;

public class MethodsWithOthers {
    public static String dayInWords(int day){
        String strDay = "";
        switch (day){
            case 1:
                strDay = "Monday";
                break;
            case 2:
                strDay = "Tuesday";
                break;
                case 3:
                strDay = "Wednesday";
                break;
            case 4:
                strDay = "Thursday";
                break;
            case 5:
                strDay = "Friday";
                break;
            case 6:
                strDay = "Saturday";
                break;
            case 7:
                strDay = "Sunday";
                break;
            default:
                strDay = "Invalid";
        }
        return strDay;

    }

    public static void main(String[] args) {
        System.out.println(dayInWords(5));
    }
    public static int firstEvenNumbers(int[] nums){
        for (int num: nums) {
            if (num % 2 == 0){
                return num;
            }
        }
        return 0;
    }
}
