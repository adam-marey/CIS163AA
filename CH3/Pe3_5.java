import java.util.Scanner;

public class Pe3_5 {
//    Find future dates) Write a program that prompts the user to enter an integer for today’s
//    day of the week (Sunday is 0, Monday is 1, ...., and Saturday is 6).
//    Also prompt the user to enter the number of days after today for a future day
//    and display the future day of the week. Here is a sample run:

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter current day of the week
        System.out.println("Enter today's day (0 for Sunday, 1 for Monday, 2 Tuesday, ....");
        int theCurrentDay = input.nextInt();

        // enter the number of days after today

        System.out.println("Enter the number of days ...");
        int numDays = input.nextInt();

        // calculate
        int futureDay = (theCurrentDay + numDays) % 7;
        // display the day of the week

        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
        System.out.println("Today is " + weekDays[theCurrentDay] + " and the future day is " + weekDays[futureDay]);
    }
}
