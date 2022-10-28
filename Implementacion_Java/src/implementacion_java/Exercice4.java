/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion_java;

import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */
public class Exercice4 {
    public static void main(String[] args) {
        //Nom: Allen
        //Cognoms: Matira
        //INS Manuel Vázquez Montalbán
        //Data d’edició: 28/10/22
        //Nom del cicle formatiu: DAW
        //Nom del mòdul: Programación

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes: ");
        int numeroMes;
        numeroMes = sc.nextInt();
        switch (numeroMes) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("Error");
                break;
        }
       
        System.out.print("Introduce el número del mes: ");
        int m;
        m = sc.nextInt();
        if (m == 1) {
            System.out.println("January");
        } else if (m == 2) {
            System.out.println("february");
        } else if (m == 3) {
            System.out.println("march");
        } else if (m == 4) {
            System.out.println("April");
        } else if (m == 5) {
            System.out.println("Mayo");
        } else if (m == 6) {
            System.out.println("June");
        } else if (m == 7) {
            System.out.println("Julio");
        } else if (m == 8) {
            System.out.println("August");
        } else if (m == 9) {
            System.out.println("September");
        } else if (m == 10) {
            System.out.println("Octubre");
        } else if (m == 11) {
            System.out.println("November");
        } else if (m == 12) {
            System.out.println("december");
        }else {
            System.out.println("Error");
        }
    }
    
}
