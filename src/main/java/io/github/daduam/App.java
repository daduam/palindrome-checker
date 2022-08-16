package io.github.daduam;

import java.util.Scanner;

// TODO
// error handling
// user input validation

/**
 * Palindrome checker
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Palindrome checker - check if a string is a palindrome\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("🔶 Enter the word to test: ");
            String word = scanner.nextLine();

            if (PalindromeChecker.check(word))
                System.out.println("✅ " + word + " is a palindrome");
            else
                System.out.println("❌ " + word + " is a not palindrome");

            System.out.println("\n😢 Do you want to quit palindrome checker?");
            System.out.println("\t1. Quit palindrome 🚩");
            System.out.println("\t2. Continue to test another string 🏁");
            System.out.print("\n🔶 Enter an option number (1 - 2): ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("👋 Quitting palindrome checker...");
                break;
            }
        }

        scanner.close();
    }
}
