package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Format 'first, last' or 'first, middle, last'");
        System.out.println("_________________________________________");
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();
        // Trim leading/trailing spaces

        // Split the full name into parts
        String[] nameParts = fullName.split("\\s+");

        // Split by any whitespace
        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (nameParts.length == 2) {
            // Format: first last
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            // Format: first middle last
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("Invalid name format. Please enter format 'first last' or 'first middle last'");
            return;
        }

        // individual name components
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + (middleName.isEmpty() ? "(none)" : middleName));
        System.out.println("Last name: " + lastName);
    }
}