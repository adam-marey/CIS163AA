// (Find the two highest scores)
// Write a program that prompts the user to enter the ­number of students and each student’s name and score,
// and finally displays the student with the highest score and the student with the second-highest score.
// Use the next() method in the Scanner class to read a name rather than using the nextLine() method.

import java.util.Scanner;

public class Pe5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String name = "";
        int score = 0;
        String nameOfHighest = "";
        int highest = 0;
        String nameOfSecondHighest = "";
        int secondHighest = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter a student name: ");
            name = input.next();
            System.out.print("Enter a student score: ");
            score = input.nextInt();
            if (score > highest) {
                secondHighest = highest;
                nameOfSecondHighest = nameOfHighest;
                highest = score;
                nameOfHighest = name;
            } else if (score > secondHighest) {
                secondHighest = score;
                nameOfSecondHighest = name;
            }
        }
        System.out.println("The student with the highest score is " + nameOfHighest + " with a score of " + highest);
        System.out.println("The student with the second highest score is " + nameOfSecondHighest + " with a score of " + secondHighest);
    }
}