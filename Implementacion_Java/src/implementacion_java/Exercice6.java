/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */
public class Exercice6 {
    public static void main(String[] args) {
        //Nom: Anass
        //Cognoms: Gzouli
        //INS Manuel Vázquez Montalbán
        //Data d’edició: 28/10/22
        //Nom del cicle formatiu: DAW
        //Nom del mòdul: Programación
        
        int month, year, days = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give us a month: ");
        month = sc.nextInt();
        System.out.print("Give us year: ");
        year = sc.nextInt();
 
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if((year %4==0 && year %100!=0) || year %400==0){
                    days = 29;
                }
                else{
                    days = 28;
                }
                break;
            default:
                System.out.println("\nThe month " + month + " is incorect.");
                break;
        }
 
        if(days!=0){
            System.out.println("\nThe month " + month + " of the year " + year + " have " + days + " days.");
        }
    }
}
