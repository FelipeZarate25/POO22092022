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
    
    private String nombreActor;
    private int edad;

    public Actor() {
    }

    public Actor(String nombreActor, int edad) {
        this.nombreActor = nombreActor;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre del actor principal = " + nombreActor + ", edad = " + edad + '}';
    }
    
     //Mi metodo de uso general
    public void actuar(){
        System.out.println("El autor "+this.nombreActor+" protagoniza Spiderman No way Home a la edad de "+this.edad+" años.\n");
    }
    
}
