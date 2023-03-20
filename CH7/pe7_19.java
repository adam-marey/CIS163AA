public class Pe7_19 {
    // **7.19 (Sorted?) Write the following method that returns true
    // if the list is already sorted in nondecreasing order:
    // public static boolean isSorted(double[] list)
    // Write a test program that prompts the user to enter a list and displays whether
    // the list is sorted or not.Here is a sample run. Note that the program first prompts the user to enter the size of the list.
    //Enter the size of the list: 8
    //Enter the contents of the list: 10 1 5 16 61 9 11 1
    //The list has 8 integers 10 1 5 16 61 9 11 1
    //The list is not sorted

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        double[] list = new double[size];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        System.out.print("The list has " + list.length + " integers ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        if (isSorted(list)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(double[] list) {
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[i - 1]) {
                return false;
            }
        }
        return true;
    }


}
