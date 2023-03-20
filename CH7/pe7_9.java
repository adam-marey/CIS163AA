public class Pe7_9 {
    // 7.9 (Find the smallest element) Write a method that finds the smallest element
    // in an array of double values using the following header:
    // public static double min(double[] array)
    // Write a test program that prompts the user to enter 10 numbers,
    // invokes this method to return the minimum value, and displays the minimum value.
    //Here is a sample run of the program:
    //Enter 10 numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
    //The minimum number is: 1.5

    public static void main(String[] args) {
        double[] numbers = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(numbers));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
