/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion_java;

/**
 *
 * @author alumne_2n
 */
public class Exercice1 {
    public static void main(String[] args) {
         //Anass Gzouli 
         //INS Manuel Vázquez Montalbán
         //28-10-1998
         //2DAW
         //Programacion
    
        //Print your name:
        System.out.println("Anass");
        //Print your first and last name on the same line:
        System.out.println("Anass Gzouli");
        //Print your first name on one line and your last name on the next:
        System.out.println("Anass \n" + "Gzouli");

        //Print a 10 by 10 square with asterisks *
        int len = 10; //square size
        int count = 0;
        while (count++ < len) {
            System.out.print("* ");
        }
        System.out.println(); 
        count = 0;
        while (count++ < len - 2) {
            System.out.print('*');
            int j = 0;
            while (j++ < len - 2) {
                System.out.print("  "); 
            }
            System.out.println(" *"); 
        }
        count = 0;
        // Last line
        while (count++ < len) {
            System.out.print("* ");
        }

        System.out.println("\n");
       
        // Print a base 10 triangle with asterisks.
        int PyramidSize = 10;

        for (int i = 1; i <= PyramidSize; i++) {
            // prints a reduced number of spaces for each new row
            for (int j = i; j <= PyramidSize - 1; j++) {
                System.out.print(" ");
            }

            //the number of asterisks for each row is 2*row number -1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

