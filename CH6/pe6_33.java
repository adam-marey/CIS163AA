import java.util.Date;

public class Pe6_33 {
    // (Current date and time) Invoking System.currentTimeMillis()
    // returns the elapsed time in milliseconds since midnight of January 1, 1970,
    // Write a program that displays the date and time. Here is a sample run:
    // Current date and time is May 16, 2012 10:34:23

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);
        System.out.println("Current date and time is " + currentDate);
    }


}
