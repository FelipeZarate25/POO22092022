/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Felipe Zarate
 */
public class Cuentahabiente {
    private int idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente = " + idCliente + ", nombre = " + nombre + ", balance = " + balance + '}';
    }
    
    /*Métodos*/
    public void retirarDinero(float monto) {
        /*NOTA: profe, estas lineas las hice para imprimir en pantalla y ver sí estaba bien, espero no haya problema. */
        System.out.println(this.nombre + " realiza un retiro $"+ monto);
        System.out.println("Su monto general es de: $" + balance);
        
        //código para restarle el monto al balance
        System.out.println("Su monto restante después de su retiro es de: $" + (this.balance - monto)+"\n");
    }

    public String evaluarNivelCliente() {
        /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
        
          return this.balance <= 50000f? "REGULAR":"PREMIUM";
        
    }
    
}
