/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_hectorsabillon;

import java.util.ArrayList;
import java.util.Date;

public class Pinturas {
    
    private ArrayList pinturas = new ArrayList();
    private String nombre;
    private String autor;
    private Date fechap;
    private Date fechaa;
    private boolean inv;

    public Pinturas(String nombre, String autor, Date fechap, Date fechaa, boolean inv) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechap = fechap;
        this.fechaa = fechaa;
        this.inv = inv;
    }
    
    
    
}
