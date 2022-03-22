/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.componentes.pelicula;

/**
 *
 * @author felipezarate
 */
public class Director {
    private String nombreDirector;
    private String gentilicio; //---------->> Origen del director, nacionalidad.

    public Director() {
    }

    public Director(String nombreDirector, String gentilicio) {
        this.nombreDirector = nombreDirector;
        this.gentilicio = gentilicio;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre de director = " + nombreDirector + ", origen = " + gentilicio + '}';
    }
    
     //Mi metodo de uso general
    public void dirigir(){
        System.out.println("El director "+this.nombreDirector+" de gentilicio "+this.gentilicio+" es muy bueno dirigiendo.\n");
    }
    
    
}
