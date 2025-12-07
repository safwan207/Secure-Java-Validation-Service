package com.myproject.validation; 
import java.util.Scanner;
public class DataValidationApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("--- Secure Data Validation Service Demo ---");
        
        //  1. Validate Email
        System.out.print("Enter your email address: ");
        input = scanner.nextLine();
        // Calls the method from the ValidationService class
        if (ValidationService.isValidEmail(input)) { 
            System.out.println("✅ Email is valid.");
        } else {
            System.out.println("❌ Email validation failed. Please review the error.");
        }

        //  2. Validate Password
        System.out.print("\nEnter a strong password (min 8, 1 U/L/N): ");
        input = scanner.nextLine();
        if (ValidationService.isValidPassword(input)) {
            System.out.println("✅ Password is valid.");
        } else {
            System.out.println("❌ Password validation failed. Please review the error.");
        }

        //  3. Validate Numeric Input 
        System.out.print("\nEnter your age (must be a number): ");
        input = scanner.nextLine();
        if (ValidationService.isNumeric(input)) {
            System.out.println("✅ Age input is numeric.");
        } else {
            System.out.println("❌ Age validation failed. Please review the error.");
        }
        
        scanner.close();
        System.out.println("\nDemo complete. Project ready for GitHub deployment!");
    }
}