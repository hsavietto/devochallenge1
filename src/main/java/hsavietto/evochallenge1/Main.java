package hsavietto.evochallenge1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main class for the challenge
 *
 * @author Helder Savietto (helder.savietto@gmail.com)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Case sensitive? (y/n, default n): ");
        String strCaseSensitive = reader.readLine();
        System.out.print("Ignore spaces? (y/n, default n): ");
        String strIgnoreSpaces = reader.readLine();
        System.out.print("Enter the sentence to be checked: ");
        String value = reader.readLine();
        boolean caseSensitive = "y".equalsIgnoreCase(strCaseSensitive.trim());
        boolean ignoreSpaces = "y".equalsIgnoreCase(strIgnoreSpaces.trim());
        System.out.println(String.format(
                "Parameters entered: case sensitive = %s, ignore spaces = %s", caseSensitive, ignoreSpaces));
        PalindromeChecker checker = new PalindromeChecker(caseSensitive, ignoreSpaces);
        String answer = checker.isPalindrome(value) ? "is" : "is not";
        System.out.println(String.format("The sentence \"%s\" %s a palindrome", value, answer));
    }
}
