/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.componentes.pelicula;

/**
 *
 * @author felipezarate
 */
public class Actor {
    
    private String nombre;
    private int edad;

    public Actor() {
    }

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre del actor principal = " + nombre + ", edad = " + edad + '}';
    }
    
     //Mi metodo de uso general
    public void actuar(){
        System.out.println("El autor "+this.nombre+" protagoniza Spiderman No way Home a la edad de "+this.edad+" años.\n");
    }
    
}
