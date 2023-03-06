// 5.1 (Count positive and negative numbers and compute the average of numbers)
//  Write a program that reads an unspecified number of integers,
//  determines how many positive and negative values have been read,
//  and computes the total and average of the input values (not counting zeros).
//  Your program ends with the input 0. Display the average as a floating-point number. Here are sample runs:

// Enter an integer, the input ends if it is 0: 1 2 –1 3 0   
// The number of positives is 3
// The number of negatives is 1
// The total is 5.0 
// The average is 1.25


import java.util.Scanner;

public class Pe5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        int positive = 0;
        int negative = 0;
        int total = 0;
        int count = 0;
        while (number != 0) {
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
            total += number;
            count++;
            number = input.nextInt();
        }
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + (total * 1.0 / count));
    }
}