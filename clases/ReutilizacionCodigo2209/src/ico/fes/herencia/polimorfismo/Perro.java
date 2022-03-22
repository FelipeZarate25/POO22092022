/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author felipezarate
 */
public class Perro extends Animal{
    private String raza;
    private String peligree;

    public Perro() {
    }

    public Perro(String raza, String peligree) {
        this.raza = raza;
        this.peligree = peligree;
    }

    public Perro(String raza, String peligree, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.peligree = peligree;
    }

    public String getPeligree() {
        return peligree;
    }

    public void setPeligree(String peligree) {
        this.peligree = peligree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    @Override
    public void emitirSonido(){
            System.out.println("El perro está ladrando. ...Guau!....Guau!....");
    }
    
    
}
