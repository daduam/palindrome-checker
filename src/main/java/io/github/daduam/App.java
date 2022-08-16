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

        System.out.print("🔶 Enter the word to test: ");
        String word = scanner.nextLine();

        if (PalindromeChecker.check(word))
            System.out.println("✅ " + word + " is a palindrome");
        else
            System.out.println("❌ " + word + " is a not palindrome");

        scanner.close();
    }
}
