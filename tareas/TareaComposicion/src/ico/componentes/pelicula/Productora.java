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
    private String compania; //--------->Compañia, distribucion encargada.

    public Productora() {
    }

    public Productora(String nombreProductora, String compania) {
        this.nombreProductora = nombreProductora;
        this.compania = compania;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre de productora = " + nombreProductora + ", distribución = " + compania + '}';
    }

     //Mi metodo de uso general
    public void producir(){
        System.out.println("La productora de "+this.nombreProductora+" hicieron una colaboración con "+this.compania+".\n");
    }
    
            
}
