public class Pe6_3 {
    // 6.3 (Palindrome integer) Write the methods with the following headers:
    // /** Return the reversal of an integer, i.e., reverse(456) returns 654 */
    // public static int reverse(int number)
    // /** Return true if number is a palindrome */
    // public static boolean isPalindrome(int number)
    // Use the reverse method to implement isPalindrome.
    // A number is a palindrome if its reversal is the same as itself.
    // Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println(num + " is " + (isPalindrome(num) ? "" : "not ") + "a palindrome.");
    }

    public static int reverse(int number) {
        int revInt = 0;
        while (number != 0) {
            revInt = revInt * 10 + number % 10;
            number /= 10;
        }
        return revInt;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }


}
