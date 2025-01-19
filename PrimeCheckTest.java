import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertTrue("Test 0: ", PrimeCheck.isPrime(97));
    assertTrue("Test 1: ", PrimeCheck.isPrime(1427));
    assertTrue("Test 2: ", PrimeCheck.isPrime(5569));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertFalse("Test 0: ", PrimeCheck.isPrime(5570));
    assertFalse("Test 1: ", PrimeCheck.isPrime(4));
    assertFalse("Test 2: ", PrimeCheck.isPrime(4444));
  }
}
