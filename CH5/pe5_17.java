// **5.17 (Display pyramid) Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid,
//  as presented in the following sample run:

// Enter the number of lines: 7  
// 		               1
//                2  1  2
//             3  2  1  2  3
//          4  3  2  1  2  3  4
//       5  4  3  2  1  2  3  4  5
//    6  5  4  3  2  1  2  3  4  5  6
// 7  6  5  4  3  2  1  2  3  4  5  6  7


import java.util.Scanner;

public class Pe5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d ", j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%2d ", j);
            }
            System.out.println();
        }
    }
}