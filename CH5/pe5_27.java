// 5.27 (Display leap years) Write a program that displays all the leap years,
// 10 per line, from 101 to 2100, separated by exactly one space.
// Also display the number of leap years in this period.

import java.util.Scanner;


public class Pe5_27 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 2100; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}