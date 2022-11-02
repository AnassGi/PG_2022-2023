/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */
public class Exercice5 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // Pido el año
        System.out.println("Give us a year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
            System.out.println("El año " + year + " es bisiesto");
        }else{
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}
