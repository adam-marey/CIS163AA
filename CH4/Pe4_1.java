// 4.1 (Geometry: area of a pentagon) Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon, as shown in the following figure.

// The formula for computing the area of a pentagon is
// Area = (5 * s^2) / (4 * tan(PI/5))
// where s is the length of a side. The side can be computed using the formula
// s = 2 * r * sin(PI/5)
// where r is the length from the center of a pentagon to a vertex. Round up two digits after the decimal point.

import java.util.Scanner;

public class pe4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter the length from the center of a pentagon to a vertex
        System.out.println("Enter the length from the center of a pentagon to a vertex: ");
        double r = input.nextDouble();

        // compute the area of the pentagon
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        // display the area of the pentagon
        System.out.println("The area of the pentagon is " + Math.round(area * 100) / 100.0);
    }
}