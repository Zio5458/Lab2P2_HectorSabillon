/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_hectorsabillon;

import java.util.Date;

/**
 *
 * @author hdann
 */
public class Esculturas {
    
    private String escultor;
    private String material;
    private Date fechaes;
    private String departamento;

    public Esculturas(String escultor, String material, Date fechaes, String departamento) {
        this.escultor = escultor;
        this.material = material;
        this.fechaes = fechaes;
        this.departamento = departamento;
    }

    public String getEscultor() {
        return escultor;
    }

    public void setEscultor(String escultor) {
        this.escultor = escultor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Date getFechaes() {
        return fechaes;
    }

    public void setFechaes(Date fechaes) {
        this.fechaes = fechaes;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Esculturas{" + "escultor=" + escultor + ", material=" + material + ", fechaes=" + fechaes + ", departamento=" + departamento + '}';
    }
    
    
    
}
