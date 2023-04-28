/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_hectorsabillon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Lab2P2_HectorSabillon {

    static Scanner sc = new Scanner(System.in);
    static ArrayList cosas = new ArrayList();
    static Date fechap;
    static Date fechaa;
    static Date fechaes;

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
                            System.out.println("Ingrese nombre de la pintura: ");
                            String nom = sc.nextLine();
                            System.out.println("Ingrese nombre del autor: ");
                            String autor = sc.nextLine();
                            System.out.println("Ingrese fecha de presentacion [dd/MM/yyyy]");
                            String fp = sc.nextLine();
                            String token[] = fp.split("/");
                            fechap = new Date(Integer.parseInt(token[2]), Integer.parseInt(token[1]), Integer.parseInt(token[0]));
                            System.out.println("Ingrese fecha de adquisicon [dd/MM/yyyy]");
                            String fa = sc.nextLine();
                            String token2[] = fa.split("/");
                            fechaa = new Date(Integer.parseInt(token2[2]), Integer.parseInt(token2[1]), Integer.parseInt(token[0]));
                            System.out.println("Esta en exposicion o en bodega [s/n]");
                            char c = sc.nextLine().charAt(0);
                            boolean inv;
                            if (c == 's'){
                                inv = true;
                            } else {
                                inv = false;
                            }
                            //fin entradas
                            Pinturas pin = new Pinturas(nom, autor, fechap, fechaa, inv);
                            cosas.add(pin);
                            
                            break;
                        case 2:
                            System.out.println("Ingrese nombre del escultor: ");
                            String esc = sc.nextLine();
                            System.out.println("Ingrese material de la escultura: ");
                            String mat = sc.nextLine();
                            System.out.println("Ingrese fecha de inicio [dd/MM/yyyy]: ");
                            String fe = sc.nextLine();
                            String token3[] = fe.split("/");
                            fechaes = new Date(Integer.parseInt(token3[2]), Integer.parseInt(token3[1]), Integer.parseInt(token3[0]));
                            System.out.println("Ingrese departamento:"
                                    + "\n1 <- Arqueologia"
                                    + "\n2 <- Artes"
                                    + "\n3 <- Historia Moderna");
                            String de = "";
                            int dep = sc.nextInt();
                            switch (dep){
                                case 1:
                                    de = "Arqueologia";
                                    break;
                                case 2:
                                    de = "Artes";
                                    break;
                                case 3:
                                    de = "Historia Moderna";
                                    break;
                            }
                            //fin entradas
                            
                            Esculturas es = new Esculturas(esc, mat, fechaes, de);
                            cosas.add(es);
                            
                            break;
                        case 3:
                            System.out.println("Ingrese dimensiones: [NUM_MEDIDA medida x NUM_MEDIDA medida]");
                            String medida = sc.nextLine();
                            System.out.println("Ingrese resolucion: [NUMxNUM]");
                            String res = sc.nextLine();
                            System.out.println("Esta a color? [s/n]");
                            char co = sc.nextLine().charAt(0);
                            boolean color;
                            if (co == 's'){
                                color = true;
                            } else {
                                color = false;
                            }
                            //fin entradas
                            
                            Fotografias foto = new Fotografias(medida, res, color);
                            cosas.add(foto);
                            
                            break;
                        case 4:
                            System.out.println("Ingrese cantidad de palabras: ");
                            int pal = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingrese epoca de redaccion: ");
                            String epoca = sc.nextLine();
                            System.out.println("Ingrese genero literario: ");
                            String genero = sc.nextLine();
                            System.out.println("Ingrese nombre del autor: ");
                            String au = sc.nextLine();
                            //fin entradas
                            
                            Escrituras escrit = new Escrituras(pal, epoca, genero, au);
                            
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---ELIMINAR---"
                            + "\n1 <- Pintura"
                            + "\n2<- Escultura"
                            + "\n3 <- Fotografia"
                            + "\n4 <- Escritura");
                    int o = sc.nextInt();
                    switch (o){
                        case 1:
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Pinturas){
                                    System.out.println(i + " <- " + cosas.get(i));
                                }
                            }
                            System.out.println("Ingrese el indice de la pintura a eliminar: ");
                            int op1 = sc.nextInt();
                            sc.nextLine();
                            cosas.remove(op1);
                            break;
                        case 2:
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Esculturas){
                                    System.out.println(i + " <- " + cosas.get(i));
                                }
                            }
                            System.out.println("Ingrese el indice de la escultura a eliminar: ");
                            int op2 = sc.nextInt();
                            sc.nextLine();
                            cosas.remove(op2);
                            break;
                        case 3:
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Fotografias){
                                    System.out.println(i + " <- " + cosas.get(i));
                                }
                            }
                            System.out.println("Ingrese el indice de la fotografia a eliminar: ");
                            int op3 = sc.nextInt();
                            sc.nextLine();
                            cosas.remove(op3);
                            break;
                        case 4:
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Escrituras){
                                    System.out.println(i + " <- " + cosas.get(i));
                                }
                            }
                            System.out.println("Ingrese el indice de la escritura a eliminar: ");
                            int op4 = sc.nextInt();
                            sc.nextLine();
                            cosas.remove(op4);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("---LISTAR---"
                            + "\n1 <- Pintura"
                            + "\n2<- Escultura"
                            + "\n3 <- Fotografia"
                            + "\n4 <- Escritura");
                    int o1 = sc.nextInt();
                    switch (o1){
                        case 1:
                            int cont1 = 1;
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Pinturas){
                                    System.out.println(cont1 + " <- " + cosas.get(i));
                                    cont1++;
                                }
                            }
                            break;
                        case 2:
                            int cont2 = 1;
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Esculturas){
                                    System.out.println(cont2 + " <- " + cosas.get(i));
                                    cont2++;
                                }
                            }
                            break;
                        case 3:
                            int cont3 = 1;
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Fotografias){
                                    System.out.println(cont3 + " <- " + cosas.get(i));
                                    cont3++;
                                }
                            }
                            break;
                        case 4:
                            int cont4 = 1;
                            for (int i = 0; i < cosas.size(); i++){
                                if (cosas.get(i) instanceof Escrituras){
                                    System.out.println(cont4 + " <- " + cosas.get(i));
                                    cont4++;
                                }
                            }
                            break;
                    }
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
