package com.mycompany.employeevalidation;

public class Login {
    private String phoneNumber;
    private String username;
    private String password; // Added password variable

    // Existing Setters and Getters...
    public void setphoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; } // Added

    public String getphoneNumber() { return phoneNumber; }
    public String getUsername() { return username; }

    // Existing Validation Methods...
    public boolean checkphoneNumber() { 
        return phoneNumber != null && phoneNumber.length() == 12
                ; 
    }
    
    public boolean checkUsername() { 
        return username != null && username.contains("_"); 
    }

    // --- NEW PASSWORD VALIDATION ---
    public boolean checkPasswordComplexity() {
        if (password == null || password.length() > 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasSpecial = false;
        String specialChars = "!@#$%^&*()-_=+[]{};:,.<>/?";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (specialChars.contains(String.valueOf(c))) {
                hasSpecial = true;
            }
        }
        return hasUppercase && hasSpecial;
    }
}