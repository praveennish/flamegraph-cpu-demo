import java.math.BigInteger;
import java.util.Random;

public class SearchNextPrimeLR {
    public static void main(String[] args) {
        Search ls = new LinearSearch();

        long startTime = System.currentTimeMillis();
        long nextPrimeNumber = nextPrimeBI(6000);
        nextPrimeNumber = Math.abs(nextPrimeNumber);
        boolean ifFound = ls.search((int)nextPrimeNumber);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
        System.out.println("Prime number "+ nextPrimeNumber + " was " + (ifFound?" found!": " not found!"));

    }

    public static int nextPrimeBI(int num) {
        BigInteger veryBig = new BigInteger(num, new Random());
        return veryBig.nextProbablePrime().intValue();
    }
}
