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
public class Purchase {
    
    private final static String MSG_1 = "Give us your Id?: ";
    private final static String MSG_2 = "Now your age!: ";
    private final static String MSG_3 = "What Type of sale?: ";
    private final static String MSG_4 = "What is the Purchase amount?: ";
    private final static String MSG_5 = "Contact number?: ";
    private final static String MSG_6 = "ERROR in the data ";
    private final static String MSG_7 = "Program ended due to data error (*-*) ";
    private static int trying = 0;
    
    public static void main(String[] args) {
       int id, age, type_sale, import_pursh, contact_number;
        String tipo_venta = "";
        Scanner sc = new Scanner(System.in);

        System.out.print(MSG_1);
        id = sc.nextInt();
        if (id >= 1000 || id <= 110) {
            System.out.print("\n" + MSG_6 + "\n");
        }
        while (id >= 1000 || id <= 110) {
            if (trying < 2) {
                System.out.print(MSG_1);
                id = sc.nextInt();
                if (id >= 1000 || id <= 110) {
                    System.out.println("\n" + MSG_6 + "\n");
                    trying++;
                }

            } else if (trying == 2) {
                System.out.println(MSG_7);
                return;
            }
        }
        System.out.print("\n" + MSG_2);
        age = sc.nextInt();
        if (age >= 121 || age <= 13) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (age >= 121 || age <= 13) {
            if (trying < 2) {
                System.out.println(MSG_2);
                age = sc.nextInt();
                if (age >= 121 || age <= 13) {
                    System.out.println("\n" + MSG_6 + "\n");
                    trying++;
                }

            } else if (trying == 2) {
                System.out.println(MSG_7);
                return;
            }
        }
        do {
            System.out.println("\n" + MSG_3 + "\n venda lliure (0)\npensionista (1)\ncarnet jove (2)\nsoci (3)\n");
        type_sale = sc.nextInt();
                
                switch (type_sale) {
                    case 0:
                        tipo_venta = "lliure";
                        break;
                    case 1:
                        tipo_venta = "pensionista";
                        break;
                    case 2:
                        tipo_venta = "jove";
                        break;
                    case 3:
                        tipo_venta = "soci";
                        break;
                    default: System.out.println(MSG_6);
                        break;
            }
                trying++;
                if(trying == 3){
                    System.out.println(MSG_7);
                    return;
                }
        }while(type_sale >= 4 || type_sale <= -1);
        System.out.print("\n" + MSG_4);
        import_pursh = sc.nextInt();
        if (import_pursh >= 1001 || import_pursh <= -1) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (import_pursh >= 1001 || import_pursh <= -1) {
            if (trying < 2) {
                System.out.print("\n" + MSG_4);
                import_pursh = sc.nextInt();
                if (import_pursh >= 1001 || import_pursh <= -1) {
                    System.out.println("\n" + MSG_6 + "\n");
                    trying++;
                }
            } else if (trying == 2) {
                System.out.println(MSG_7);
                return;
            }
        }
        System.out.print("\n" + MSG_5);
        contact_number = sc.nextInt();
        if (contact_number >= 1000000000 || contact_number <= 111111110) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (contact_number >= 1000000000 || contact_number <= 111111110) {
            if (trying < 2) {
                System.out.print("\n" + MSG_5);
                contact_number = sc.nextInt();
                if (contact_number >= 1000000000 || contact_number <= 111111110) {
                    System.out.println("\n" + MSG_6 + "\n");
                    trying++;
                }
                return;
            } else if (trying == 2) {
                System.out.println(MSG_7);
                return;
            }
        }
        
        
        System.out.println("\n" + "ID:\t" + "Age:\t" + "Type:\t" + "Import:\t" + "Phone number:\t");
        System.out.println(id + "\t" + age + "\t" + tipo_venta + "\t" + import_pursh + "\t" + contact_number);
    }
        
    }
