package primenumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PrimeNumberCheckerTest {

    PrimeNumberChecker checker = new PrimeNumberChecker();

    @Test
    public void testIsPrime() {
        assertFalse(checker.isPrime(0));
        assertFalse(checker.isPrime(1));
        assertTrue(checker.isPrime(2));
        assertTrue(checker.isPrime(3));
        assertFalse(checker.isPrime(4));
    }

    @Test
    public void testPathCoverage() {
        assertTrue(checker.isPrime(5));
        assertFalse(checker.isPrime(10));
        assertFalse(checker.isPrime(-5));
        assertTrue(checker.isPrime(7));
    }
    @Test
    public void testLargePrimes() {
        assertTrue(checker.isPrime(29));
        assertTrue(checker.isPrime(97));
        assertFalse(checker.isPrime(100));
        assertTrue(checker.isPrime(101));
    }
}
//test case