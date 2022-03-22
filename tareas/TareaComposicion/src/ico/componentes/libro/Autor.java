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
    private String nombreAutor;
    private int edad;

    public Autor() {
    }

    public Autor(String nombreAutor, int edad) {
        this.nombreAutor = nombreAutor;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre del autor = " + nombreAutor + ", edad = " + edad + '}';
    }

     //Mi metodo de uso general
    public void escribirLibro(){
        System.out.println("El libro del señor de los anillos fue escrito por "+ this.nombreAutor + " fue famoso escritor de "+this.edad+" años de edad.\n");
    }

    
    
}
