import java.util.Scanner;

public class Pe7_1 {
// *7.1 (Assign grades) Write a program that reads student scores,
// gets the best score, and then assigns grades based on the following scheme:
// Grade is A if score is >= best - 10
// Grade is B if score is >= best - 20;
// Grade is C if score is >= best - 30;
// Grade is D if score is >= best - 40;
// Grade is F otherwise.
// The program prompts the user to enter the total number of students,
// then prompts the user to enter all of the scores,
    // Enter the number of students: 4
    //Enter 4 scores: 40 55 70 58
    //Student 0 score is 40 and grade is C
    //Student 1 score is 55 and grade is B
    //Student 2 score is 70 and grade is A
    //Student 3 score is 58 and grade is B

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];
        int bestScore = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter score for student " + i + ": ");
            scores[i] = input.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        char[] grade = new char[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= bestScore - 10) {
                grade[i] = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grade[i] = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grade[i] = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade[i]);
        }
    }
}
