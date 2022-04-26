/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author felipezarate
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int edad = 20;
        System.out.println("Edad = "+ edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(",-,-,-,-,-,-,-,-,");
        /*Convertir String a entero*/
        String cadena = "99";
        int altura = Integer.parseInt(cadena); // Método miembro metodo de clase.
        Color c1 = Color.BLUE; //Atributo miembro o atributo de clase
        altura+= 1;
        System.out.println("Altura = " + altura);
        
        
        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = "+ y);
        System.out.println("----------------------------");
        
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = "+ Arbol.tronco);
        Arbol.generarOxigeno();
        /*
        JOptionPane.showMessageDialog(null, "Hola Mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
        */
        
         //Concepto de metodo y atributo de clase: atributo miembros o clases miembros.
        
        /*Codigo sin operador ternario*/
        int edad3 = 20;
        
        String resultado="";
        if(edad3 < 18){
        resultado= "Menor de edad";
        
        }else {
        resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        
        /*Estructura*/
        //<Cond>? <Sección caso True> : <Sesióc casoFalse>
        /*Operador ternario*/
        int edad4 = 24;
        String res = "";
        res = edad < 18? "Menor de edad 4":"Mayor de edad, tequila";
        System.out.println(res);
            
        /*Version mínima*/
        int edad5 = 19;
        System.out.println(edad<18?"Menor de edad 5": "Ya! el tequila");
        
        /*Boleano a nivel bits*/
        int val1 = 1;
        int val2 = 5;
        System.out.println(val1 & val2);
        
        
        /*Desplazamientos a nivel bits*/
        int val3 =1;
        //int val4 <<= val3; 
        //System.out.println(val3 <<= );
        int val4 =0;
        val4= val3 << 1;
        System.out.println(val4);
       
        System.out.println("----------ARREGLOS------------");
        
        int[] edades; /*primero se declara que será un arreglo*/
        
        edades = new int[5];
        System.out.println(edades); //en kilos
        
        //En C o C++
        edades[0]= 10;
        System.out.println("La primera edad es: "+ edades[0]);
        
        int [] estaturas = new int[5];
        int [] pesos = {86, 99, 56, 76, 77}; /*AL igual que en C en asignar valores*/
        
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        System.out.println("----CON FOR-----");
        for (int i= 0; i < pesos.length; i++){
            System.out.println(pesos[i]);
        }
        
         System.out.println("----ORDEN INVERSO----");
        for (int i= pesos.length-1; i >= 0; i--){
            System.out.println(pesos[i]);
        }
        
        //Otra forma del Fore
        for (int peso : pesos) {
            System.out.println(peso);
        }
        
        System.out.println("Arreglo de alumnos");
        Alumno[] lista= new Alumno[5]; //5 alumnos
        lista[0] = new Alumno("99999", 2, 9.0f);
        lista[1] = new Alumno("77777", 2, 7.0f);
        lista[2] = new Alumno("55555", 2, 7.0f);
        lista[3] = new Alumno("88888", 2, 8.0f);
        lista[4] = new Alumno("66666", 2, 6.0f);
        
        /*lenght << Longitud del arreglo*/
        for (int i = 0; i < lista.length; i++) {
            Alumno tmp = lista[i];
            System.out.println(tmp.evaluarDesempeño()); //FORI + TAB
        tmp.estudiar(30);
        }
        /*Otra forma de usar el For*/
        System.out.println("----------------------------");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].evaluarDesempeño()); //FORI + TAB
        }
        System.out.println("------------------------------------");
        
        /*For each es un For especial, introducido en la version 2 de java, esa version fue 
        la que sufrio cambios muy grandes java
        EL FOR EACH fue introducido para simplificar los For con arreglos <FOR + TAB>*/
        System.out.println("---------------------------------------------------------");
        System.out.println("CON FOR EACH...");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempeño());
        }
        
        System.out.println("----------ARRAY LIST-------");
        ArrayList<Alumno> grupo2209= new ArrayList<>();
        grupo2209.add(new Alumno("99999", 2, 9.0f));
        grupo2209.add(new Alumno("88888", 2, 8.0f));
        grupo2209.add(new Alumno("77777", 2, 7.0f));
        grupo2209.add(new Alumno("66666", 2, 6.0f));
        grupo2209.add(new Alumno("55555", 2, 5.0f));
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        /**/
        System.out.println("------------Add con indice---------------");
        grupo2209.add(2, new Alumno("81111", 3, 9.9f));
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        System.out.println("-------Devuelve un elemento--------");
        Alumno tmp = grupo2209.get(3); //NC= 77777
        System.out.println("Alumno de index = 1: "+tmp);
        
        System.out.println("-------Remover o eliminar--------");
        System.out.println("Eliminar el index 3 ");
        Alumno tmp2 = grupo2209.remove(3);
        System.out.println("Elemento sacado = "+ tmp2) ;
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        
        System.out.println("-----Remplazar el i-esimo elemento-----------");
        Alumno tmp3 = grupo2209.set(0, new Alumno("444444", 4, 4.0f));
        System.out.println("El sacado es= "+tmp3);
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        /*Excepciones*/
       
        /*trycatch * TAB*/
        try {
            System.out.println("----------Excepciones--------");
            System.out.println(grupo2209.get(20));
        } catch (Exception e) {
            System.out.println("Error.. revisa los indices");
        }

        System.out.println("Fin del programa ");

    }
        
    
}
//Un atributo de clase o metodo de clase(elementos miembros) son identificadores que almacenan un valor constante o un comportamiento constante igual para todo los objetos de la misma.
//Al ser contante no es necesario crear una instancia(objeto), para acceder a ellos
