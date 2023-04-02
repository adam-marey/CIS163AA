public class Pe8_1 {
    // *8.1 (Sum elements column by column)
    // Write a method that returns the sum of all the elements
    // in a specified column in a matrix using the following header:
    // public static double sumColumn(double[][] m, int columnIndex)
    // Write a test program that reads a 3-by-4 matrix and displays
    // the sum of each column.
    public static void main(String[] args) {
        double[][] m = new double[3][4];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < m[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }


}
