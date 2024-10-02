package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input their name

        System.out.println("Enter your name below");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();

        //trim leading spaces

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // Joining the string and creating the full name
        //below is the breakdown in case there are missing inputs (add appropriate spacing for later concatenation)

        middleName = (middleName.isBlank()) ? " " : " " + middleName + " "; //If no middle name, get rid of space.
        suffix = (suffix.isBlank()) ? "" : ", " + suffix;               // if there is a suffix, add comma before.

        //concatenate the full string
        String fullName = firstName + middleName + lastName + suffix;

        //Output = full name
        System.out.println("Hey, " + fullName); // output: Whole name


            }

        }
