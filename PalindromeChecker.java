/* This file defines the methods of the PalindromeChecker class. */
package PalindromeChecker;

public class PalindromeChecker {

    private String input;

    public PalindromeChecker(String inputString) {
        setInputString(inputString);
    }

    public void setInputString(String inputString) {
        this.input = inputString.toLowerCase();
    }

    public boolean checkString() {
        return isPalindrome(0, input.length() - 1);
    }

    private boolean isPalindrome(int inputStart, int inputEnd) {
        /* Base Case */
        if (inputStart >= inputEnd) {
            return true;
        }

        /* Base Case */
        if (this.input.charAt(inputStart) != this.input.charAt(inputEnd)) {
            return false;
        }

        /* Recursive Call */
        return isPalindrome(inputStart + 1, inputEnd - 1);
    }
}