/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projectjava2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ProjectJava2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get number of customers
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine(); // consume new line character

        // arrays to store customer data
        int[] ids = new int[numCustomers];
        int[] ages = new int[numCustomers];
        int[] saleTypes = new int[numCustomers];
        int[] purchaseAmounts = new int[numCustomers];
        int[] phoneNumbers = new int[numCustomers];

        // loop to get data for each customer
        for (int i = 0; i < numCustomers; i++) {
            int attempts = 0;

            // get customer id
            while (attempts < 3) {
                System.out.print("Enter customer id (between 111 and 999): ");
                String input = scanner.nextLine();

                try {
                    ids[i] = Integer.parseInt(input);

                    if (ids[i] >= 111 && ids[i] <= 999) {
                        break;
                    } else {
                        System.out.println("Invalid id. Please enter a number between 111 and 999.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }

                attempts++;
            }

            if (attempts == 3) {
                System.out.println("You have exhausted all attempts. The data for this customer will not be saved.");
                continue;
            }

            // get age
            attempts = 0;
            while (attempts < 3) {
                System.out.print("Enter age (between 14 and 120): ");
                String input = scanner.nextLine();

                try {
                    ages[i] = Integer.parseInt(input);

                    if (ages[i] >= 14 && ages[i] <= 120) {
                        break;
                    } else {
                        System.out.println("Invalid age. Please enter a number between 14 and 120.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }

                attempts++;
            }

            if (attempts == 3) {
                System.out.println("You have exhausted all attempts. The data for this customer will not be saved.");
                continue;
            }
            //add the rest of the code for getting data for purchase amount and phone number
            //and storing them in the appropriate array
            //...

            // get user input for whether or not to continue adding customers
            System.out.print("Do you want to enter another customer? (yes: 1/ no: 0): ");
            int continueAdding = scanner.nextInt();
            scanner.nextLine(); // consume new line character

            if (continueAdding == 0) {
                break;
            }
        }

        // display summary of customer data
        System.out.println("\nSummary of customer data:");
        for (int i = 0; i < numCustomers; i++) {
            System.out.println("\nCustomer " + (i + 1) + ":");
            System.out.println("ID: " + ids[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Sale type: " + saleTypes[i]);
            System.out.println("Purchase amount: " + purchaseAmounts[i]);
            System.out.println("Phone number: " + phoneNumbers[i]);
        }
        // prompt user for filtering by sale type and displaying data
        System.out.print("Do you want to filter by sale type? (yes: 1/ no: 0): ");
        int filter = scanner.nextInt();
        scanner.nextLine(); // consume new line character

        if (filter == 1) {
            System.out.print("Enter sale type (0-3): ");
            int type = scanner.nextInt();
            scanner.nextLine(); // consume new line character

            System.out.println("Data for customers of type " + type + ":");
            System.out.println("ID\tAge\tType\tPurchase amount\tPhone number");
            for (int i = 0; i < numCustomers; i++) {
                if (saleTypes[i] == type) {
                    System.out.println(ids[i] + "\t" + ages[i] + "\t" + saleTypes[i] + "\t" + purchaseAmounts[i] + "\t" + phoneNumbers[i]);
                }
            }
        }

        // prompt user for displaying statistics
        System.out.print("Do you want to see a statistical summary of the data? (yes: 1/ no: 0): ");
        int summary = scanner.nextInt();
        scanner.nextLine(); // consume new line character

        if (summary == 1) {
            // code to calculate and display statistical summary
            //...
        }
    }

}
