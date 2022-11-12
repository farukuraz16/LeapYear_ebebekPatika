import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("Please enter a year= ");//get year from user
        int year = dat.nextInt();

        if (year % 100 == 0) {//check the year which is multiples of 100
            if (year % 400 == 0) {//check the year which is multiples of 400
                System.out.println(year + " is leap year.");
            } else System.out.println(year + " is not leap year.");
        } else if (year % 100 != 0) {//check the year which is multiples of 100
            if (year % 4 == 0) {//check the year which is multiples of 4
                System.out.println(year + " is leap year.");
            } else System.out.println(year + " is not leap year.");

        }


    }


}
