/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import ico.componentes.pelicula.Actor;
import ico.componentes.pelicula.Director;
import ico.componentes.pelicula.Productora;

/**
 *
 * @author felipezarate
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private Actor principal;
    private Director director;
    private Productora productora;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int duracion, Actor principal, Director director, Productora productora) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.principal = principal;
        this.director = director;
        this.productora = productora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Actor getPrincipal() {
        return principal;
    }

    public void setPrincipal(Actor principal) {
        this.principal = principal;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "título de pelicula = " + titulo + ", género = " + genero + ", duración = " + duracion + " minutos, actor = " + principal + ", director = " + director + ", productora = " + productora + '}';
    }

    //Mi metodo de uso general
    public void ver(){
        System.out.println("Ahora estoy viendo la pelicula de " + this.titulo+" del genero de "+this.genero+", con una duración de "+this.duracion+" minutos.\n");
    }
   
}

