/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/*Herencia: Mecanismo que nos permite reutilizar los atributos y métodos de una clase
para herederarlos a una clase derivada que lo especialice.*/

/*NOTA: La herencia es conocida como especialización, debido a que la clase que heredó
complementará los atributos y métodos compartidos de la superclase.*/

/*Las clases guardan una relación del tipo "es un"*/
/**
 *
 * @author felipezarate
 */ //Expecializar a la clase persona 
public class Alumno extends Persona{
    private String numeroCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public Alumno(String numeroCuenta, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + '}';
    }
    
    
    public void estudiar(int cantidad){
        System.out.println(this.getNombre()+"esta estudiando"+cantidad+"Hrs");
    }
    //Polimorfismo por sobre escritura
    @Override //----> Sobrescribir método
    public void dormir(){
        System.out.println("El estudiante "+ this.getNombre()+"está durmiendo 5 horas...");
    }
    
    //Polimorfismo por sobre carga
    public void dormir(int horasEstudio){
    
        int horasDormir = 8;
        System.out.println(this.getNombre()+"está durmiendo "
                +(horasDormir-horasEstudio)+" horas");
    
    }
}
