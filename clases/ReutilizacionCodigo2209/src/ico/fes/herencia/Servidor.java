/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author felipezarate
 */
public class Servidor extends Computadora {
    private String numeroFuentePoder;
    private int numeroTarjetaRed;
    private int tipoRaid;

    public Servidor() {
    }

    public Servidor(String numeroFuentePoder, int numeroTarjetaRed, int tipoRaid) {
        this.numeroFuentePoder = numeroFuentePoder;
        this.numeroTarjetaRed = numeroTarjetaRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(String numeroFuentePoder, int numeroTarjetaRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuentePoder = numeroFuentePoder;
        this.numeroTarjetaRed = numeroTarjetaRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public String getNumeroFuentePoder() {
        return numeroFuentePoder;
    }

    public void setNumeroFuentePoder(String numeroFuentePoder) {
        this.numeroFuentePoder = numeroFuentePoder;
    }

    public int getNumeroTarjetaRed() {
        return numeroTarjetaRed;
    }

    public void setNumeroTarjetaRed(int numeroTarjetaRed) {
        this.numeroTarjetaRed = numeroTarjetaRed;
    }

    @Override
    public String toString() {
        return "Servidor{" + "numeroFuentePoder=" + numeroFuentePoder + ", numeroTarjetaRed=" + numeroTarjetaRed + ", tipoRaid=" + tipoRaid + '}';
    }
   
    
}
