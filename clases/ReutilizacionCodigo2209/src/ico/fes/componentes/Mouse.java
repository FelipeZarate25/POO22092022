/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author felipezarate
 */
public class Mouse {
    private String marca;
    private String tipo;

    public Mouse() {
    }

    public Mouse(String Marca, String tipo) {
        this.marca = Marca;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Mouse{" + "Marca=" + marca + ", tipo=" + tipo + '}';
    }
    
    
    
}
