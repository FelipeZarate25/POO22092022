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
    private String origen; //---------->> Origen del director, nacionalidad.

    public Director() {
    }

    public Director(String nombreDirector, String origen) {
        this.nombreDirector = nombreDirector;
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre de director = " + nombreDirector + ", origen = " + origen + '}';
    }
    
    public void dirigir(){
        System.out.println("El director "+this.nombreDirector+" de gentilicio "+this.origen+" es muy bueno dirigiendo.\n");
    }
    
    
}
