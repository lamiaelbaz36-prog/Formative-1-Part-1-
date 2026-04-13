package com.mycompany.employeevalidation;
import java.util.Scanner;

public class EmployeeValidation {
    public static void main(String[] args) {
        Login login = new Login();
        Scanner scan = new Scanner(System.in);

        // --- PHONE NUMBER SECTION ---
        System.out.print("Enter your cell number: ");
        String phoneInput = scan.nextLine();
        login.setphoneNumber(phoneInput);

        if (login.checkphoneNumber()) {
            System.out.println("Phone number is successfully captured.");

            // --- USERNAME SECTION ---
            System.out.print("Enter your username: ");
            String userWeight = scan.nextLine();
            login.setUsername(userWeight);

            if (login.checkUsername()) {
                System.out.println("Username successfully captured.");
                
                // --- PASSWORD SECTION ---
                System.out.print("Enter your password: ");
                String passInput = scan.nextLine();
                login.setPassword(passInput);

                if (login.checkPasswordComplexity()) {
                    System.out.println("Password successfully captured.");

                    // --- FINAL SUMMARY ---
                    System.out.println("\n--- Registration Details ---");
                    System.out.println("Phone: " + login.getphoneNumber());
                    System.out.println("User:  " + login.getUsername());
                } else {
                    System.out.println("Password not entered successfully, please enter a password with one special character and one capital letter (max 8 characters).");
                }

            } else {
                System.out.println("Username is not successfully captured.");
            }

        } else {
            System.out.println("Phone number is invalid. Ensure it is 10 digits.");
        }
        
        scan.close();
    }
}

