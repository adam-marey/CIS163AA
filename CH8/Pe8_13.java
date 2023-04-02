public class Pe8_13 {
    //*8.13 (Locate the largest element) Write the following method that returns
    // the location of the largest element in a two-dimensional array:
    // public static int[] locateLargest(double[][] a)
    // The return value is a one-dimensional array that contains two elements.
    // These two elements indicate the row and column indices of the largest
    // element in the two-dimensional array. Write a test program that prompts
    // the user to enter a two-dimensional array and displays the location of
    // the largest element in the array.
    //Enter the number of rows and columns of the array: 3 4
    //Enter the array:
    //23.5 35 2 10
    //4.5 3 45 3.5
    //35 44 5.5 9.6
    //The location of the largest element is at (1, 2)

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] a = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        int[] location = locateLargest(a);
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }
    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2];
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

}
