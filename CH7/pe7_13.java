public class Pe7_13 {
    // *7.13 (Random number chooser) Write a method that returns a random number
    // between 1 and 54, excluding the numbers passed in the argument.
    // The method header is specified as follows:
    // public static int getRandom(int... numbers)

    public static void main(String[] args) {
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getRandom(numbers);
            System.out.print(numbers[i] + " ");
        }
    }

    // helper function
    public static int getRandom(int... numbers) {
        int number = (int) (Math.random() * 54) + 1;
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                number = getRandom(numbers);
            }
        }
        return number;
    }
}
