/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.componentes.pelicula;

/**
 *
 * @author felipezarate
 */
public class Productora {
    private String nombreProductora;
    private String distribucion; //--------->Compañia encargada.

    public Productora() {
    }

    public Productora(String nombreProductora, String distribucion) {
        this.nombreProductora = nombreProductora;
        this.distribucion = distribucion;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre de productora = " + nombreProductora + ", distribución = " + distribucion + '}';
    }

    
    public void producir(){
        System.out.println("La productora de "+this.nombreProductora+" hicieron una colaboración con "+this.distribucion+".\n");
    }
    
            
}
