// 1.1

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun");
    }

}

// 1.3
public class Main {
    public static void main(String[] args) {
        System.out.println("J");
        System.out.println("J aaa v vaaa");
        System.out.println("J J aa v v a a");
        System.out.println("J aaaa v aaaa");
    }
}

//  1.5
public class Main {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3\ta^4");
        for (int i = 1; i <= 4; i++) {
            int a2 = i * i;
            int a3 = i * i * i;
            int a4 = i * i * i * i;
            System.out.println(i + "\t" + a2 + "\t" + a3 + "\t" + a4);
        }
    }
}


// 1.7
public class Main {
    public static void main(String[] args) {
        System.out.println(7.5 * 6.5 - 4.5 * 3);
    }
}

// 1.9
public class Main {
    public static void main(String[] args) {
        double pi = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        double pii = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        System.out.println("Approximate value of pi is : " + pi);
        System.out.println("Approximate value of pi with more decimal places is : " + pii);
    }
}

// 1.13
public class Main {
    public static void main(String[] args) {
        double width = 5.3;
        double height = 8.6;
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area of the rectangle is : " + area);
        System.out.println("Perimeter of the rectangle is : " + perimeter);
    }
}
