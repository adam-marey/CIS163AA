import java.util.Scanner;

public class Pe7_3 {
    // 7.3 (Count occurrence of numbers)
    // Write a program that reads the integers between 1 and 100 and counts the occurrences of each.
    // Assume the input ends with 0. Here is a sample run of the program:
    // Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
    // 2 occurs 2 times
    // 3 occurs 1 time
    // 4 occurs 1 time
    // 5 occurs 2 times
    // 6 occurs 1 time
    // 23 occurs 1 time
    // 43 occurs 1 time

    public static void main(String[] args) {
        int[] numbers = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int number = input.nextInt();
        while (number != 0) {
            numbers[number - 1]++;
            number = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println((i + 1) + " occurs " + numbers[i] + " times");
            }
        }
    }
    }