package hsavietto.devochallenge1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Helder Savietto (helder.savietto@gmail.com)
 */
public class TestPalindromeChecker {

    private static final String POOR_DAN = "Poor Dan is in a droop";
    private static final String HID_A_BOOT = "too  bad   I  hid a  boot  ";
    private static final String PHOBIA = "Aibohphobia";
    private static final String ROTATOR = "rotator";

    @Test
    public void testWithDefaultValues() {
        PalindromeChecker checker = new PalindromeChecker();

        // strings with one character or less are palindrome by definition
        Assert.assertTrue(checker.isPalindrome(""));
        Assert.assertTrue(checker.isPalindrome("a"));

        // strings with only spaces area palindrome by definition
        Assert.assertTrue(checker.isPalindrome(" "));
        Assert.assertTrue(checker.isPalindrome("  "));
        Assert.assertTrue(checker.isPalindrome("   "));

        // common cases
        Assert.assertFalse(checker.isPalindrome(POOR_DAN));
        Assert.assertFalse(checker.isPalindrome(HID_A_BOOT)); // fails on spaces
        Assert.assertTrue(checker.isPalindrome(PHOBIA));      // fails on case sensitiveness
        Assert.assertTrue(checker.isPalindrome(ROTATOR));
    }

    @Test
    public void testCaseSensitive() {
        PalindromeChecker checker = new PalindromeChecker(true, false);

        // strings with one character or less are palindrome by definition
        Assert.assertTrue(checker.isPalindrome(""));
        Assert.assertTrue(checker.isPalindrome("a"));

        // strings with only spaces area palindrome by definition
        Assert.assertTrue(checker.isPalindrome(" "));
        Assert.assertTrue(checker.isPalindrome("  "));
        Assert.assertTrue(checker.isPalindrome("   "));

        // common cases
        Assert.assertFalse(checker.isPalindrome(POOR_DAN));   // fails on case sensitiveness
        Assert.assertFalse(checker.isPalindrome(HID_A_BOOT)); // fails on spaces
        Assert.assertFalse(checker.isPalindrome(PHOBIA));     // fails on case sensitiveness
        Assert.assertTrue(checker.isPalindrome(ROTATOR));
    }

    @Test
    public void testIgnoreSpaces() {
        PalindromeChecker checker = new PalindromeChecker(false, true);

        // strings with one character or less are palindrome by definition
        Assert.assertTrue(checker.isPalindrome(""));
        Assert.assertTrue(checker.isPalindrome("a"));

        // strings with only spaces area palindrome by definition
        Assert.assertTrue(checker.isPalindrome(" "));
        Assert.assertTrue(checker.isPalindrome("  "));
        Assert.assertTrue(checker.isPalindrome("   "));

        // common cases
        Assert.assertTrue(checker.isPalindrome(POOR_DAN));
        Assert.assertTrue(checker.isPalindrome(HID_A_BOOT));
        Assert.assertTrue(checker.isPalindrome(PHOBIA));
        Assert.assertTrue(checker.isPalindrome(ROTATOR));
    }

}
