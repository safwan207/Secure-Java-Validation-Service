# Secure Java Input Validation Service

A modular, console-based Java application designed to enforce strict input integrity, focusing on *security-first development principles*.

## 🌟 Key Features

* *Secure Email Validation:* Utilizes Regular Expressions (Regex) to ensure valid email formats.
* *Strong Password Policy:* Enforces a minimum length of 8 characters, including at least one uppercase letter, one lowercase letter, and one digit.
* *Numeric Integrity:* Uses Java's *Exception Handling* (NumberFormatException) to gracefully manage non-numeric input.

## 🚀 Getting Started

This project can be compiled and run using any standard Java Development Kit (JDK).

*1. Compilation:*

```bash
# Navigate to the directory containing your Java files
javac com/myproject/validation/*.java

*2. Execution:*
java com.myproject.validation.DataValidationApp

This project was developed based on principles focusing on preventing basic injection vulnerabilities through stringent input checking.
