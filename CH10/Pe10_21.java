import java.math.BigInteger;

public class Pe10_21 {
    public static void main(String[] args) {
        BigInteger longMaxValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger number = longMaxValue.add(BigInteger.ONE);

        int count = 0;
        while (count < 10) {
            BigInteger remainder5 = number.remainder(BigInteger.valueOf(5));
            BigInteger remainder6 = number.remainder(BigInteger.valueOf(6));

            if (remainder5.equals(BigInteger.ZERO) || remainder6.equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
