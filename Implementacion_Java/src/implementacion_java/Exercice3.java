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
public class Exercice3 {
    //Anass Gzouli 
    //INS Manuel Vázquez Montalbán
    //28-10-1998
    //2DAW
    //Programacion

    //Commentaire exercice_A
    private static final String MSG_1 = "Give us a number :";
    private static final String MSG_2 = "The number is negative  ";
    private static final String MSG_3 = "The number is positive  ";

    //Commentaire exercice_B
    private static final String MSG_4 = "Give us a number :";
    private static final String MSG_5 = "The number is higher than 35  ";
    private static final String MSG_6 = "The number is smaller than 35  ";
    private static final String MSG_7 = "The number is equal to 35  ";

    ////Commentaire exercice_C
    private static final String MSG_11 = "Give us a number :";
    private static final String MSG_12 = "The number is positive and less than 100 ";
    private static final String MSG_13 = "Error";

    //Commentaire exercice_D
    private static final String MSG_8 = "Give us a number :";
    private static final String MSG_9 = "The number is between -3 and 27  ";
    private static final String MSG_10 = "The number is not between -3 and 27  ";

    ////Commentaire exercice_E
    private static final String MSG_14 = "Give us a number :";
    private static final String MSG_15 = "The number is out of 25 and 50  ";
    private static final String MSG_16 = "Error";
    
    ////Commentaire exercice_E
    private static final String MSG_17 = "Give us the two numbers :";
    private static final String MSG_18 = "The number is out of 25 and 50  ";
    private static final String MSG_19 = "Error";
    public static void main(String[] args) {
        //A
        /*
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num >= 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_2);
        }
         */
        //B
        /*
        int num;
         Scanner sc = new Scanner(System.in);
        System.out.println(MSG_4);
        num = sc.nextInt();
        if(num>35){
              System.out.println(MSG_5);
        } else if (num== 35){
             System.out.println(MSG_7);
        }
        else {
            System.out.println(MSG_6);
        }
         */
        //C
        /*
        int num;
         Scanner sc = new Scanner(System.in);
        System.out.println(MSG_11);
        num = sc.nextInt();
        if(num<100 && num>=0){
            System.out.println(MSG_12);
        }else{
            System.out.println(MSG_13);
        }
         */
        //D
        /*
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_8);
        num = sc.nextInt();
        if(num>= -3 && num<=27){
        System.out.println(MSG_9);
    }
        else {
            System.out.println(MSG_10);
            }
         */
        /*
        //E
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_14);
        num = sc.nextInt();
        if (num >= 25 && num <= 50) {
            System.out.println(MSG_16);
        } else {
            System.out.println(MSG_15);
        }
        */
        //F
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_17);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
    }

}