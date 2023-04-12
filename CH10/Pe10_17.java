import java.math.BigInteger;

public class Pe10_17 {
    public static void main(String[] args) {
        BigInteger longMaxValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger i = new BigInteger(Long.toString((long) Math.sqrt(Long.MAX_VALUE)));

        int count = 0;
        while (count < 10) {
            i = i.add(BigInteger.ONE);
            BigInteger squareNumber = i.multiply(i);

            if (squareNumber.compareTo(longMaxValue) > 0) {
                System.out.println(squareNumber);
                count++;
            }
        }
    }
}
