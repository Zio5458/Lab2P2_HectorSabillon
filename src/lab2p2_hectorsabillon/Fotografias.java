/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_hectorsabillon;

/**
 *
 * @author hdann
 */
public class Fotografias {
    
    private String dimension;
    private String resolucion;
    private boolean color;

    public Fotografias(String dimension, String resolucion, boolean color) {
        this.dimension = dimension;
        this.resolucion = resolucion;
        this.color = color;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(color){
            return "Fotografias{" + "dimension=" + dimension + ", resolucion=" + resolucion + ", color=" + "a color" + '}';
        } else {
            return "Fotografias{" + "dimension=" + dimension + ", resolucion=" + resolucion + ", color=" + "blanco y negro" + '}';
        }
    }
    
    
    
}
