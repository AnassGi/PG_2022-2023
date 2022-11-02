/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author alumne_2n
 */
public class Exercice7 {
        //Nom: Anass
        //Cognoms: Gzouli
        //INS Manuel Vázquez Montalbán
        //Data d’edició: 28/10/22
        //Nom del cicle formatiu: DAW
        //Nom del mòdul: Programación
    public static void main(String args[]) {
        //A
        int num = 100;
        System.out.println("Write the first 10 numbers starting with 0 on the screen.");
        //from 1 to 10.
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
        
        //B
        System.out.println("Write on the screen the first 100 numbers starting with 0.");
        //from 1 to 100.
        while (num <= 100) {
            System.out.println(num);
            num++;
        }
        //C
        System.out.println(" Write the first 100 even numbers starting with 0.");
        //from 1 to 100.
        while (num <= 100){
            if (num % 2 == 0){
            System.out.println(num);
            }
            num++; 
        } 
        //D
        System.out.println(" Write the numbers from 0 to 100 in descending order.");
        while (num <= 100 && (num >= 0)) {
            System.out.println(num);
            num--;
        }
    }
}
