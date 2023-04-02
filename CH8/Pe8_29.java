public class Pe8_29 {

    //8.29 (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they have the same contents.
    // Write a method that returns true if m1 and m2 are identical, using the following header:
    //Write a test program that prompts the user to enter two 3 * 3 arrays of integers and displays whether the two are identical.
    //Enter list1: 51 22 25 6 1 4 24 54 6
    //Enter list2: 51 22 25 6 1 4 24 54 6
    // The two arrays are identical

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        int[][] m2 = new int[3][3];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextInt();
            }
        }
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


}
