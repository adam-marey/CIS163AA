public class Pe7_17 {
    // 7.17 (Sort students) Write a program that prompts the user to enter the number of students,
    // the students’ names, and their scores and prints student names
    // in decreasing order of their scores. Assume the name is a string
    // without spaces, use the Scanner’s next() method to read a name.
    // Here is a sample run:
    // Enter the number of students: 3
    // Enter student name and score: sulaiman 90
    // Enter student name and score: marey 85
    // Enter student name and score: adam 95
    // Student name: adam score: 95
    // Student name: sulaiman score: 90
    // Student name: marey score: 85

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student name and score: ");
            names[i] = input.next();
            scores[i] = input.nextInt();
        }
        sortStudents(names, scores);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(names[i] + " " + scores[i]);
        }
    }

    public static void sortStudents(String[] names, int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int currentMax = scores[i];
            int currentMaxIndex = i;
            String currentMaxName = names[i];
            for (int j = i + 1; j < scores.length; j++) {
                if (currentMax < scores[j]) {
                    currentMax = scores[j];
                    currentMaxIndex = j;
                    currentMaxName = names[j];
                }
            }
            if (currentMaxIndex != i) {
                scores[currentMaxIndex] = scores[i];
                scores[i] = currentMax;
                names[currentMaxIndex] = names[i];
                names[i] = currentMaxName;
            }
        }
    }

}
