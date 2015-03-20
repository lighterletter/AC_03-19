package nyc.c4q.lighterletter;
import java.util.Scanner;
import java.util.Calendar;

/**
 * John Gomez 03-19
 * program asks user to input their birthday month and year
 * as integers and outputs how many days left until their birthday.
 */

public class Main {

    public static int birthDate(int date){
        Calendar calendar =Calendar.getInstance();
        calendar.set(0,0,date);


        return date;
    }

    public static int birthMonth(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(0,month-1,0);

        return month;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar rightNow = Calendar.getInstance();

        System.out.println("Please enter your Birthday: \n" +
                "What is the month: ");
              int month = input.nextInt();
        birthMonth(month);


        System.out.println("What is the date: ");
              int date = input.nextInt();
        birthDate(date);


        Calendar calendar = Calendar.getInstance();

        int currentDay = rightNow.get(Calendar.DAY_OF_YEAR);


        calendar.set(2015,birthMonth(month)-1,birthDate(date)); //Made the difference because of how Java counts months

        int birthday =  calendar.get(Calendar.DAY_OF_YEAR);


        int daysLeft = birthday - currentDay;



        System.out.print(daysLeft);





    }
}
