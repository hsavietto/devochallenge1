package hsavietto.evochallenge1;

/**
 * A class to check whether strings are palindrome
 *
 * @author Helder Savietto (helder.savietto@gmail.com)
 */
public class PalindromeChecker {

    private final boolean caseSensitive;
    private final boolean ignoreSpaces;

    /**
     * Constructor
     *
     * @param caseSensitive whether the palindrome checker will consider lower and upper case characters as different
     * @param ignoreSpaces  whether the palindrome checker will ignore spaces
     */
    public PalindromeChecker(boolean caseSensitive, boolean ignoreSpaces) {
        this.caseSensitive = caseSensitive;
        this.ignoreSpaces = ignoreSpaces;
    }

    /**
     * Constructor with default configuration (case insensitive, consider spaces)
     */
    public PalindromeChecker() {
        this(false, false);
    }

    /**
     * Check whether a given string is palindrome, considering the configurations passed at the constructor.
     * This method doesn't check for null input and can throw NullPointerException.
     *
     * @param value the string to have its "palindromeness" checked
     * @return whether the string in <pre>value</pre> is palindrome
     * @throws NullPointerException when <pre>value is null</pre>
     */
    public boolean isPalindrome(String value) {
        int leftCursor = 0;
        int rightCursor = value.length() - 1;

        while (leftCursor < rightCursor) {
            if (ignoreSpaces) {
                while (leftCursor < rightCursor && value.charAt(leftCursor) == ' ') {
                    ++leftCursor;
                }

                while (rightCursor > leftCursor && value.charAt(rightCursor) == ' ') {
                    --rightCursor;
                }

                if (rightCursor <= leftCursor) {
                    return true;
                }
            }

            char charAtLeft = value.charAt(leftCursor);
            char charAtRight = value.charAt(rightCursor);

            if ((caseSensitive && charAtLeft != charAtRight)
                    || (!caseSensitive && Character.toLowerCase(charAtLeft) != Character.toLowerCase(charAtRight))) {
                return false;
            }

            ++leftCursor;
            --rightCursor;
        }

        return true;
    }
}
