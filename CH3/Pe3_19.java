import java.util.Scanner;

public class Pe3_19 {
    // Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes the perimeter if the input is valid.
    // Otherwise, display that the input is invalid.
    // The input is valid if the sum of every pair of two edges is greater than the remaining edge.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges for a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (edge2 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            System.out.println("The perimeter of the triangle is " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("The input is invalid");
        }
    }
}
