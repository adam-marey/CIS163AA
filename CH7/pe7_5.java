import java.util.Scanner;

public class Pe7_5 {
    // **7.5 (Print distinct numbers) Write a program that reads in 10 numbers
    // and displays the number of distinct numbers and the distinct numbers
    // in their input order and separated by exactly one space (i.e., if a number appears multiple times,
    // it is displayed only once). (Hint: Read a number and store it to an array if it is new.
    // If the number is already in the array, ignore it.) After the input,
    // the array contains the distinct numbers. Here is the sample run of the program:

    // Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
    //The number of distinct numbers is 6
    //The distinct numbers are: 1 2 3 6 4 5

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = new int[10];
        int distinctNumbersCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < distinctNumbersCount; j++) {
                if (numbers[i] == distinctNumbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctNumbers[distinctNumbersCount] = numbers[i];
                distinctNumbersCount++;
            }
        }
        System.out.println("The number of distinct numbers is " + distinctNumbersCount);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumbersCount; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }

}
