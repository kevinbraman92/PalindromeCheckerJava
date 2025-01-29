/* This is file acts as the main for the package. A Scanner object is initialized and passed as a parameter to a User Interface object.*/
package PalindromeChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.startInterface();
        scanner.close();
    }
}
