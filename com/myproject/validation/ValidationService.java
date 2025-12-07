package com.myproject.validation; 

public class ValidationService {

    /**
     * Checks if a string is null or empty after trimming whitespace.
     */
    public static boolean isNotNullOrEmpty(String value) {
        if (value == null || value.trim().isEmpty()) {
            System.err.println("Validation Error: Input cannot be empty.");
            return false;
        }
        return true;
    }

    /**
     * Validates an email address format using a simple Regular Expression.
     */
    public static boolean isValidEmail(String email) {
        if (!isNotNullOrEmpty(email)) {
            return false;
        }
        // Simple Regex: [A-Za-z0-9+_-.]+ @ [domain] . [extension]
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (email.matches(emailRegex)) {
            return true;
        } else {
            System.err.println("Validation Error: Invalid email format provided.");
            return false;
        }
    }

    /**
     * Validates a strong password: min 8 chars, 1 uppercase, 1 lowercase, 1 digit.
     */
    public static boolean isValidPassword(String password) {
        if (!isNotNullOrEmpty(password)) {
            return false;
        }
        // Regex for strong password
        // Requires: 8+ length, at least one lowercase, one uppercase, and one digit
        String passwordRegex = "^(?=.[a-z])(?=.[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        if (password.matches(passwordRegex)) {
            return true;
        } else {
            System.err.println("Validation Error: Password must be at least 8 characters and include 1 uppercase letter, 1 lowercase letter, and 1 number.");
            return false;
        }
    }

    /**
     * Checks if a string contains only digits (for ID, age, etc.).
     */
    public static boolean isNumeric(String value) {
        if (!isNotNullOrEmpty(value)) {
            return false;
        }
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            System.err.println("Validation Error: Input must be a valid number.");
            return false;
        }
    }
}
