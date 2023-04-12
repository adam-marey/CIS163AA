import java.util.Scanner;
public class Pe10_5 {
    //    (Display the prime factors) Write a program that prompts the user
    //    to enter a positive integer and displays all its smallest factors
    //    in decreasing order. For example, if the integer is 120,
    //    the smallest factors are displayed as 5, 3, 2, 2, 2.
    //    Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5)
    //    and retrieve and display them in reverse order.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers();
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static class StackOfIntegers {
        private int[] elements;
        private int size;
        public static final int DEFAULT_CAPACITY = 16;

        public StackOfIntegers() {
            this(DEFAULT_CAPACITY);
        }

        public StackOfIntegers(int capacity) {
            elements = new int[capacity];
        }

        public void push(int value) {
            if (size >= elements.length) {
                int[] temp = new int[elements.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
            }
            elements[size++] = value;
        }

        public int pop() {
            return elements[--size];
        }

        public int peek() {
            return elements[size - 1];
        }

        public boolean empty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }
    }
}
