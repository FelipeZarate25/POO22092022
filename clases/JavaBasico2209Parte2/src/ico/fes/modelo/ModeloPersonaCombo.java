/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Felipe Zarate
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona> {
       private ArrayList<Persona> datos;
       private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }
/*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
    @Override
    public void setSelectedItem(Object anItem) {
         this.selected = (Persona)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
         //Regresará el numero de elementos a mostrar
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

    
     public void consultarBaseDatos(){
         //simular una consulta de una BD
         datos = new ArrayList<Persona>();
         //conextion a Bd
           //Consulta SQL
           datos.add(new Persona("José", 19));
           datos.add(new Persona("María", 21));
           datos.add(new Persona("Jesús", 33));
           datos.add(new Persona("Diana", 2));
     }  
     
    public void agregarPersona(Persona p) {
        //Insert a BD
        datos.add(p);
    }
    
}

