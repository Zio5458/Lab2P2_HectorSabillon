/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_hectorsabillon;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_HectorSabillon {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("---LOGIN---"
                + "\nIngrese usuario: ");
        String u = sc.nextLine();
        System.out.println("Ingrese contrasena: ");
        String pass = sc.nextLine();
        System.out.println("Forma parte del personal administrativo? [s/n]: ");
        String r = sc.nextLine();
        
        if (admin(r) && r.charAt(0) == 's'){
            System.out.println("---MENU ADMIN---"
                    + "\n1 <- Crear"
                    + "\n2 <- Eliminar"
                    + "\n3 <- Listar"
                    + "\n4 <- Modificar"
                    + "\n5 <- Salir"
                    + "\nIngrese una opcion: ");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("---AGREGAR---"
                            + "\n1 <- Pintura"
                            + "\n2 <- Escultura"
                            + "\n3 <- Fotografia"
                            + "\n4 <- Escritura"
                            + "\nIngrese una opcion: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    switch (a){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
        
    }

    public static boolean admin(String r){
        if (r.charAt(0) == 's'){
            return true;
        } else if (r.charAt(0) == 'n'){
            return false;
        }
        return false;
    }
    
}
