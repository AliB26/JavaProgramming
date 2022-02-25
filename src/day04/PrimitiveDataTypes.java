package day04;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte age = 4;
        System.out.println(age);

        long bignumber = 191919191919191L;

        System.out.println(bignumber);

        System.out.println("--------------------------------------------");

        int month, day, year;
        month=2;
        day=11;
        year=2022;

        System.out.print(month + "/" + day + "/" + year);
        System.out.println("--------------------------------------------");

        int grade1=16;
        int grade2=20;
        int grade3=28;
        int grade4=31;
        int grade5=33;

        System.out.println("There're "+grade1+" students in Grade 1");
        System.out.println("There're "+grade2+" students in Grade 2");
        System.out.println("There're "+grade3+" students in Grade 3");
        System.out.println("There're "+grade4+" students in Grade 4");
        System.out.println("There're "+grade5+" students in Grade 5");
        int total = grade1 + grade2+grade3+grade4+grade5;
        System.out.println("Total number of students is "+total);

        System.out.println("total = " + total);





    }
}
