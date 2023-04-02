public class Pe8_5 {
    // 8.5 (Algebra: add two matrices) Write a method to add two matrices. The header of the method is as follows:
    // public static double[][] addMatrix(double[][] a, double[][] b)
    // In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements. Let c be the resulting matrix. Each element cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
    // c00 a00 + b00 c01 a01 + b01 c02 a02 + b02
    // c10 a10 + b10 c11 a11 + b11 c12 a12 + b12
    // c20 a20 + b20 c21 a21 + b21 c22 a22 + b22
    // Write a test program that prompts the user to enter two 3 * 3 matrices and displays their sum.

    //Enter matrix1: 1 2 3 4 5 6 7 8 9
    //Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
    //The matrices are added as follows
    // 1.0 2.0 3.0      0.0 2.0 4.0      1.0 4.0 7.0
    // 4.0 5.0 6.0  +   1.0 4.5 2.2  =   5.0 9.5 8.2
    // 7.0 8.0 9.0      1.1 4.3 5.2      8.1 12.3 14.2

    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter matrix1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter matrix2: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = input.nextDouble();
            }
        }
        double[][] c = addMatrix(a, b);
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            if (i == 1) {
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}
