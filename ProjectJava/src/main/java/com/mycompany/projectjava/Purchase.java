/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectjava;


import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variable to keep track of the number of attempts for each data entry
        int attempts;
        
        // customer data
        int id;
        int age;
        int saleType;
        int purchaseAmount;
        int phoneNumber;

        // get customer id
        attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter customer id (between 111 and 999): ");
            String input = scanner.nextLine();

            try {
                id = Integer.parseInt(input);

                if (id >= 111 && id <= 999) {
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
            System.out.println("You have exhausted all attempts. The program will now exit.");
            return;
        }
        
        // get customer age
        attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter customer age (between 14 and 120): ");
            String input = scanner.nextLine();

            try {
                age = Integer.parseInt(input);

                if (age >= 14 && age <= 120) {
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
            System.out.println("You have exhausted all attempts. The program will now exit.");
            return;
        }
        
        // get sale type
        attempts = 0;
        while (attempts < 3) {
            System.out.println("Sale type options:");
            System.out.println("0 - Regular sale");
            System.out.println("1 - Pensioner sale");
            System.out.println("2 - Young card sale");
            System.out.println("3 - Member sale");
            System.out.print("Enter sale type: ");
            String input = scanner.nextLine();

            try {
                saleType = Integer.parseInt(input);

                if (saleType >= 0 && saleType <= 3) {
                    break;
                } else {
                    System.out.println("Invalid sale type. Please enter a number between 0 and 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            attempts++;
        }

        if (attempts == 3) {
            System.out.println("You have exhausted all attempts. The program will now exit.");
            return;
        }
        
        // get purchase amount
        attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter purchase amount (between 0 and 1000): ");
            String input = scanner.nextLine();

            try {
                purchaseAmount = Integer.parseInt(input);

                if (purchaseAmount >= 0 && purchaseAmount <= 1000) {
                    break;
                } else {
                    System.out.println("Invalid purchase amount. Please enter a number between 0 and 1000.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            attempts++;
        }

        if (attempts == 3) {
            System.out.println("You have exhausted all attempts. The program will now exit.");
            return;
        }

        // get phone number
        attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter phone number (between 111111111 and 999999999): ");
            String input = scanner.nextLine();

            try {
                phoneNumber = Integer.parseInt(input);
                String phoneNumberString = Integer.toString(phoneNumber);

                if (phoneNumber >= 111111111 && phoneNumber <= 999999999 && phoneNumberString.length() == 9) {
                    break;
                } else {
                    System.out.println("Invalid phone number. Please enter a number between 111111111 and 999999999 and 9 digits long.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            attempts++;
        }

        if (attempts == 3) {
            System.out.println("You have exhausted all attempts. The program will now exit.");
            return;
        }

        // print summary
        System.out.println("Summary:");
        System.out.println("Customer id: " + id);
        System.out.println("Age: " + age);
System.out.println("Sale type: " + saleType);
System.out.println("Purchase amount: " + purchaseAmount);
System.out.println("Phone number: " + phoneNumber);
}
}


