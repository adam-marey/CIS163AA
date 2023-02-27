
import java.util.Scanner;
public class pe4_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // enter the first 9 digits
        System.out.println("Enter the first 9 digits of an ISBN as a string: ");
        String isbnString = input.nextLine();

        // convert string to integer array
        int[] isbn = new int[isbnString.length()];
        isbn[0] = Character.getNumericValue(isbnString.charAt(0));
        isbn[1] = Character.getNumericValue(isbnString.charAt(1));
        isbn[2] = Character.getNumericValue(isbnString.charAt(2));
        isbn[3] = Character.getNumericValue(isbnString.charAt(3));
        isbn[4] = Character.getNumericValue(isbnString.charAt(4));
        isbn[5] = Character.getNumericValue(isbnString.charAt(5));
        isbn[6] = Character.getNumericValue(isbnString.charAt(6));
        isbn[7] = Character.getNumericValue(isbnString.charAt(7));
        isbn[8] = Character.getNumericValue(isbnString.charAt(8));

        // calculate the sum;
        int sum = (isbn[0] * 1 + isbn[1] * 2 + isbn[2] * 3 + isbn[3] * 4 + isbn[4] * 5
                + isbn[5] * 6 + isbn[6] * 7 + isbn[7] * 8 + isbn[8] * 9) % 11;

        // show result;
        System.out.print("The ISBN-10 number is " + isbnString);

        // if condition;
        if (sum == 10) {
            System.out.println("X");
        } else {
            System.out.println(sum);
        }
    }

}
