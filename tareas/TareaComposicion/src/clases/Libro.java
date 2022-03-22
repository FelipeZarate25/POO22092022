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
    private String nombre;
    private String genero;
    //Aqui se hizo la composición
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String nombre, String genero, Autor autor, Editorial editorial) {
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Libro{" + "nombre del libro= " + nombre + ", género = " + genero + ", autor = " + autor + ", editorial = " + editorial + '}';
    }

    
     //*Para leer un libro ---->metodo
    public void leer(){
        System.out.println("Estoy leyendo el libro, que lleva como nombre " + this.nombre+" de género del "+this.genero+".\n");
    }
   
    
}