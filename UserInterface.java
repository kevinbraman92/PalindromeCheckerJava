/* This file defines the methods of the UserInterface class. */
package PalindromeChecker;

import java.util.Scanner;

public class UserInterface {

    private final Scanner USER_INPUT;

    public UserInterface(Scanner scanner) {
        this.USER_INPUT = scanner;
    }

    public void startInterface() {
        while (true) {
            System.out.print("\nPlease enter the string you would like to check (or type 'QUIT' to exit): ");
            String inputString = USER_INPUT.nextLine();
            if (inputString.equalsIgnoreCase("quit")) {
                System.out.println("Exiting interface...");
                break;
            }
            palindromeCheck(inputString);
        }
    }

    public void palindromeCheck(String input) {
        PalindromeChecker checker = new PalindromeChecker(input);
        System.out.printf("Is the string a Palindrome: %s\n", checker.checkString());
    }
}