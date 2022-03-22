/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.componentes.libro;

/**
 *
 * @author felipezarate
 */
public class Autor {
    private String nombre;
    private int edad;

    public Autor() {
    }

    public Autor(String nombre, int edad) {
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
        return "Autor{" + "nombre del autor = " + nombre + ", edad = " + edad + '}';
    }

     //Mi metodo de uso general
    public void escribir(){
        System.out.println("El libro del señor de los anillos fue escrito por "+ this.nombre + " fue famoso escritor de "+this.edad+" años de edad.\n");
    }

    
    
}
