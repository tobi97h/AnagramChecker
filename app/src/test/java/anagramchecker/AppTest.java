package anagramchecker;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAnagramsPositive() {
        var isAnagram = AnagramChecker.isAnagram("race", "care");
        assertTrue(isAnagram);
    }
    @Test public void testAnagramsNegative() {
        var isAnagram = AnagramChecker.isAnagram("race", "cars");
        assertFalse(isAnagram);
    }
}
