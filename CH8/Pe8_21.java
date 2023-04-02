public class Pe8_21 {
    // *8.21 (Central city) Given a set of cities, the central city
    // is the city that has the shortest total distance to all other cities.
    // Write a program that prompts the user to enter the number of cities
    // and the locations of the cities (coordinates),
    // and finds the central city and its total distance to all other cities.
    // Here is a sample run:
    // Enter the number of cities: 5
    // Enter the coordinates of the cities:
    //    2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
    //The central city is at (2.5, 5.0)
    //The total distance to all other cities is 60.81

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        double[][] cities = new double[numberOfCities][2];
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                cities[i][j] = input.nextDouble();
            }
        }
        double[] centralCity = getCentralCity(cities);
        System.out.println("The central city is at (" + centralCity[0] + ", " + centralCity[1] + ")");
        System.out.println("The total distance to all other cities is " + centralCity[2]);
    }
    public static double[] getCentralCity(double[][] cities) {
        double[] centralCity = new double[3];
        double minDistance = Double.MAX_VALUE;
        for (int i = 0; i < cities.length; i++) {
            double totalDistance = 0;
            for (int j = 0; j < cities.length; j++) {
                totalDistance += distance(cities[i][0], cities[i][1], cities[j][0], cities[j][1]);
            }
            if (totalDistance < minDistance) {
                minDistance = totalDistance;
                centralCity[0] = cities[i][0];
                centralCity[1] = cities[i][1];
                centralCity[2] = totalDistance;
            }
        }
        return centralCity;
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


}
