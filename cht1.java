// 1.1

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }

}

// // 1.3
public class Pattern {
    public static void main(String[] args) {
        System.out.println("   J     A     V     V     A");
        System.out.println("    J    A A     V   V     A A");
        System.out.println("J   J   AAAAA     V V     AAAAA");
        System.out.println(" J J   A     A     V     A     A");
    }
}

// //  1.5
public class ComputeExpression {
    public static void main(String[] args) {
        double total = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println("Total: " + total);
    }
}


// // 1.7
public class ApproximatePI {
    public static void main(String[] args) {
        double pi = 4.0;
        double sign = 1.0;
        for (int i = 3; i < 10000; i += 2) {
            pi += sign * (4.0 / i);
            sign = -sign;
        }
        System.out.println("Approximate value of pi: " + pi);
    }
}

// // 1.9
public class Rectangle {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}


// // 1.11
public class PopulationProjection {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsInAYear = 365 * 24 * 60 * 60;
        int birthsPerYear = secondsInAYear / 7;
        int deathsPerYear = secondsInAYear / 13;
        int immigrantsPerYear = secondsInAYear / 45;
        int populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
        System.out.println("Year 1 Population: " + (currentPopulation + populationChangePerYear));
        System.out.println("Year 2 Population: " + (currentPopulation + 2 * populationChangePerYear));
        System.out.println("Year 3 Population: " + (currentPopulation + 3 * populationChangePerYear));
        System.out.println("Year 4 Population: " + (currentPopulation + 4 * populationChangePerYear));
        System.out.println("Year 5 Population: " + (currentPopulation + 5 * populationChangePerYear));
    }
}

// 1.13

public class LinearEquations {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double denominator = a * d - b * c;
        if (denominator == 0) {
            System.out.println("The equation is zero");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
}
