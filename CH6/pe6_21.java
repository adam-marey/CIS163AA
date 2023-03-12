public class Pe6_21 {
    //(Phone keypads) The international standard letter/number mapping for telephones is given in Programming Exercise 4.15. Write a method that returns a number, given an uppercase letter, as follows:
    //public static int getNumber(char uppercaseLetter)
    //Write a test program that prompts the user to enter a phone number as a string. The input number may contain letters. The program translates a letter (uppercase or lowercase) to a digit and leaves all other characters intact.
    //Enter a string: 1-800-Flowers
    //1-800-3569377
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = new java.util.Scanner(System.in).nextLine();
        System.out.println(str + " is " + getNumber(str));
    }
    public static String getNumber(String str) {
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                num += getNumber(ch);
            } else {
                num += ch;
            }
        }
        return num;
    }
    public static int getNumber(char uppercaseLetter) {
        char ch = Character.toUpperCase(uppercaseLetter);
        if (ch >= 'W') {
            return 9;
        } else if (ch >= 'T') {
            return 8;
        } else if (ch >= 'P') {
            return 7;
        } else if (ch >= 'M') {
            return 6;
        } else if (ch >= 'J') {
            return 5;
        } else if (ch >= 'G') {
            return 4;
        } else if (ch >= 'D') {
            return 3;
        } else {
            return 2;
        }
    }

}
