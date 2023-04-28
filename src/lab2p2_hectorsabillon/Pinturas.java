/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_hectorsabillon;

import java.util.Date;

public class Pinturas {

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechap() {
        return fechap;
    }

    public void setFechap(Date fechap) {
        this.fechap = fechap;
    }

    public Date getFechaa() {
        return fechaa;
    }

    public void setFechaa(Date fechaa) {
        this.fechaa = fechaa;
    }

    public boolean isInv() {
        return inv;
    }

    public void setInv(boolean inv) {
        this.inv = inv;
    }

    @Override
    public String toString() {
        if (inv) {
            return "Pinturas{" + "nombre=" + nombre + ", autor=" + autor + ", fechap=" + fechap + ", fechaa=" + fechaa + ", inv=" + "exposicion" + '}';
        } else {
            return "Pinturas{" + "nombre=" + nombre + ", autor=" + autor + ", fechap=" + fechap + ", fechaa=" + fechaa + ", inv=" + "bodega" + '}';
        }
    }

}
