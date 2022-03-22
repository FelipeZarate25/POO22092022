/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.componentes.libro;

/**
 *
 * @author felipezarate
 */
public class Editorial {
    private String nombreEditorial;
    private String edicion;

    public Editorial() {
    }

    public Editorial(String nombreEditorial, String edicion) {
        this.nombreEditorial = nombreEditorial;
        this.edicion = edicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre de la editorial = " + nombreEditorial + ", edicion = " + edicion + "}\n";
    }
    
    public void describir(){
        System.out.println("Ahora estoy leyendo el libro del gran escritor J.J.J Tolkien, publicado por el "+this.nombreEditorial+" como "+this.edicion+".\n" );
    }
}
