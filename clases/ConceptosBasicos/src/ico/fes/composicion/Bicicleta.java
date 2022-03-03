/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

/**
 *
 * @author felipezarate
 */
public class Bicicleta {
    private Marco marco;
    private Llanta llantaTrasera;
    private Llanta llantaDelnatera;
    private Pedal pedalDerecho;
    private Pedal pedalIzquierdo;
    private String marca;

    public Bicicleta() {
    }

    public Bicicleta(Marco marco, Llanta llantaTrasera, Llanta llantaDelnatera, Pedal pedalDerecho, Pedal pedalIzquierdo, String marca) {
        this.marco = marco;
        this.llantaTrasera = llantaTrasera;
        this.llantaDelnatera = llantaDelnatera;
        this.pedalDerecho = pedalDerecho;
        this.pedalIzquierdo = pedalIzquierdo;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    public Llanta getLlantaTrasera() {
        return llantaTrasera;
    }

    public void setLlantaTrasera(Llanta llantaTrasera) {
        this.llantaTrasera = llantaTrasera;
    }

    public Llanta getLlantaDelnatera() {
        return llantaDelnatera;
    }

    public void setLlantaDelnatera(Llanta llantaDelnatera) {
        this.llantaDelnatera = llantaDelnatera;
    }

    public Pedal getPedalDerecho() {
        return pedalDerecho;
    }

    public void setPedalDerecho(Pedal pedalDerecho) {
        this.pedalDerecho = pedalDerecho;
    }

    public Pedal getPedalIzquierdo() {
        return pedalIzquierdo;
    }

    public void setPedalIzquierdo(Pedal pedalIzquierdo) {
        this.pedalIzquierdo = pedalIzquierdo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "marco=" + marco + ", llantaTrasera=" + llantaTrasera + ", llantaDelnatera=" + llantaDelnatera + ", pedalDerecho=" + pedalDerecho + ", pedalIzquierdo=" + pedalIzquierdo + ", marca=" + marca + '}';
    }
    
    
    
}
