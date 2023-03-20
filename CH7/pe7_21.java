public class Pe7_21 {
    // (Sum integers) Write a program that passes an unspecified number
    // of integers from command line and displays their total.
    // For example, if you enter java Exercise7_21 1 2 3 4 5 6 7 8 9 10,
    // the program displays 55.

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("The sum is " + sum);
    }




}
