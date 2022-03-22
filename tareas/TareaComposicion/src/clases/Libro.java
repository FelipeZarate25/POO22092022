/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import ico.componentes.libro.Autor;
import ico.componentes.libro.Editorial;

/**
 *
 * @author felipezarate
 */
public class Libro {
    //Atributos
    private String nombreLibro;
    private String genero;
    //Aqui se hizo la composición
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String nombreLibro, String genero, Autor autor, Editorial editorial) {
        this.nombreLibro = nombreLibro;
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre del libro= " + nombreLibro + ", género = " + genero + ", autor = " + autor + ", editorial = " + editorial + '}';
    }

    
     //*Para leerLibro un libro ---->metodo
    public void leerLibro(){
        System.out.println("Estoy leyendo el libro, que lleva como nombre " + this.nombreLibro+" de género del "+this.genero+".\n");
    }
   
    
}