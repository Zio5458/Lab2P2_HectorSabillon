/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_hectorsabillon;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_HectorSabillon {

    static Scanner sc = new Scanner(System.in);
    static ArrayList pinturas = new ArrayList();
    static ArrayList esculturas = new ArrayList();
    static ArrayList fotografias = new ArrayList();
    static ArrayList escritos = new ArrayList();

    public static void main(String[] args) {
        
        System.out.println("---LOGIN---"
                + "\nIngrese usuario: ");
        String u = sc.nextLine();
        System.out.println("Ingrese contrasena: ");
        String pass = sc.nextLine();
        System.out.println("Forma parte del personal administrativo? [s/n]: ");
        String r = sc.nextLine();
        
        if (admin(r) && r.charAt(0) == 's'){
            
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
