// *4.7 (Corner point coordinates) Suppose a pentagon is centered at (0, 0)
//  with one point at the 0 o’clock position, as shown in Figure 4.4c.
//  Write a program that prompts the user to enter the radius of the bounding circle of a pentagon and displays the coordinates of the five corner points on the pentagon from p1 to p5 in this order.
//  Use console format to display two digits after the decimal point. Here is a sample run:

// Enter the radius of the bounding circle: 100.52   
// The coordinates of five points on the pentagon are
// (95.60, 31.06)
// (0.00, 100.52)
// (−95.60, 31.06)
// (−58.08, −81.32)
// (59.08, −81.32)

import java.util.Scanner;

public class pe4_7 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the radius of the bounding circle: ");
            double radius = input.nextDouble();
            input.close();

            System.out.println("The coordinates of five points on the pentagon are...");
            for (int i = 0; i < 5; i++) {

                double x = radius * Math.sin(2.0 * Math.PI / 5.0 * i);
                double y = radius * Math.cos(2.0 * Math.PI / 5.0 * i);
                System.out.printf("(%.2f, %.2f)%n", x, y);
            }

        }

}