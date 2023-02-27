import java.util.Scanner;

public class Pe3_9 {
    //  Exercise 3.9 - (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits:
//  d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other
//  nine digits using the following formula:
//  (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
//  If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
//  Write a program that prompts the user to enter the first 9 digits and displays the 10-digit
//  ISBN (including leading zeros). Your program should read the input as an integer.
//  Here are sample runs:
//  Enter the first 9 digits of an ISBN as integer: 013601267
//  The ISBN-10 number is 0136012671

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // enter the first 9 digits
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        // calculate the sum;
        int d1 = isbn / 100000000;
        int d2 = isbn / 10000000 % 10;
        int d3 = isbn / 1000000 % 10;
        int d4 = isbn / 100000 % 10;
        int d5 = isbn / 10000 % 10;
        int d6 = isbn / 1000 % 10;
        int d7 = isbn / 100 % 10;
        int d8 = isbn / 10 % 10;
        int d9 = isbn % 10;

        int sum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        // show result;

        System.out.print("The ISBN-10 number is " + isbn);
        // if condition;
        if (sum == 10)
            System.out.println("X");
        else
            System.out.println(sum);
    }
}
