//Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the ISBN number as a string.

// 4.20 (Process a string) Write a program that prompts the user to enter a string and displays its length and its first character.

// *4.21 (Check SSN) Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid. Here are sample runs:




// Enter a SSN: 232−23−5435    
// 232−23−5435 is a valid social security number

// Enter a SSN: 23−23−5435
// 23−23−5435 is an invalid social security number

import java.util.Scanner;

public class pe4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter a SSN
        System.out.println("Enter a SSN: ");
        String ssn = input.nextLine();

        // check whether the input is valid
        boolean isValid = (ssn.length() == 11) && (Character.isDigit(ssn.charAt(0))) && (Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2))) && (ssn.charAt(3) == '-') && (Character.isDigit(ssn.charAt(4))) && (Character.isDigit(ssn.charAt(5))) && (ssn.charAt(6) == '-') && (Character.isDigit(ssn.charAt(7))) && (Character.isDigit(ssn.charAt(8))) && (Character.isDigit(ssn.charAt(9))) && (Character.isDigit(ssn.charAt(10)));

        // display the result
        System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ") + "social security number");
    }
}