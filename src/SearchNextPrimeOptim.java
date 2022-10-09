import java.math.BigInteger;
import java.util.Random;

public class SearchNextPrimeOptim {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        long startTime = System.currentTimeMillis();
        int nextPrimeNumber = nextPrime(6000);
        boolean ifFound = bs.search(nextPrimeNumber);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));

        System.out.println("Prime number "+ nextPrimeNumber + " was " + (ifFound?" found!": " not found!"));

    }

    public static int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if(num%i == 0) {
                num++;
                i=2;
            } else {
                continue;
            }
        }
        return num;
    }
}
