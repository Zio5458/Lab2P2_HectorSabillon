/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_hectorsabillon;

/**
 *
 * @author hdann
 */
public class Escrituras {
    
    private int palabras;
    private String epoca;
    private String genero;
    private String autor;

    public Escrituras(int palabras, String epoca, String genero, String autor) {
        this.palabras = palabras;
        this.epoca = epoca;
        this.genero = genero;
        this.autor = autor;
    }

    public int getPalabras() {
        return palabras;
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Escrituras{" + "palabras=" + palabras + ", epoca=" + epoca + ", genero=" + genero + ", autor=" + autor + '}';
    }
    
    
    
}
