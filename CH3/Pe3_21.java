import java.util.Scanner;

public class Pe3_21 {
    // (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is
// h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7
// where
// h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday)
// q is the day of the month
// m is the month (3: March, 4: April, . . ., 12: December). January and February are counted as months 13 and 14 of the previous year.
// j is the century (i.e., year / 100)
// k is the year of the century (i.e., year % 100)
// Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.
// Here are some sample runs:
// Enter year: (e.g., 2012): 2015
// Enter month: 1-12: 1
// Enter the day of the month: 1-31: 25
// Day of the week is Saturday
// Enter year: (e.g., 2012): 2012

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        input.close();
        int q = day;
        int m = month;
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        String dayOfWeek = "";
        // use if condition
        if (h == 0) {
            dayOfWeek = "Saturday";
        } else if (h == 1) {
            dayOfWeek = "Sunday";
        } else if (h == 2) {
            dayOfWeek = "Monday";
        } else if (h == 3) {
            dayOfWeek = "Tuesday";
        } else if (h == 4) {
            dayOfWeek = "Wednesday";
        } else if (h == 5) {
            dayOfWeek = "Thursday";
        } else if (h == 6) {
            dayOfWeek = "Friday";
        }
        System.out.println("Day of the week is " + dayOfWeek);
    }
}
