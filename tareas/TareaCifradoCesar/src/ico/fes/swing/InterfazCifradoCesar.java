/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Zarate
 */
public class InterfazCifradoCesar extends JFrame implements ActionListener{
 
    //DECLARACIÓN DE LA VARIABLES / PRIVATE
    /*NOTA: Letras usados usados en el cifrado*/
    String letras = "abcdefghijklmnñopqrstuvwxyz";

    private JTextField cMensaje;
    private JTextField cMensajeD;
    private JTextField cDesplazar;

    private JLabel etiMensaje;
    private JLabel etIngresar;
    private JLabel etiDesp;

    private JButton btn;

    /*Método Constructor*/
    public InterfazCifradoCesar() throws HeadlessException {

        /*Titulo de la ventana*/
        setTitle("Cifrado César");

        /*Dimensión de la ventana*/
        setSize(490, 465);
                
        /*Disposición de la ventana*/
        setLayout(null);
        //setLocationRelativeTo(null);
        //setLayout(new FlowLayout(FlowLayout.CENTER));    //Para centralizar la ventana

        /*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
        
        /*Declaración del Objeto "Etiqueta del tipo de desplazamiento" */
        etiDesp = new JLabel("Tipo de desplazamiento:");
        etiDesp.setBounds(25, 20, 400, 50);

        /*Declaración del objeto "Para el cuadro del desplazamiento*/
        cDesplazar = new JTextField();
        cDesplazar.setBounds(25, 55, 35, 25);
        cDesplazar.setToolTipText("Por favor de introducir el número de desplazamiento deseado");  //Para mostrar el ToolTip

        /*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
        /*Etiqueta Ingresar "Ingresa un mensaje"*/
        etIngresar = new JLabel("Ingresa un mensaje: ");
        etIngresar.setBounds(25, 77, 400, 50);

        /*Campo de texto a cifrar*/
        cMensaje = new JTextField();
        cMensaje.setBounds(25, 110, 200, 250);
        cMensaje.setToolTipText("Por favor de introducir el texto a cifrar");

        /*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
        /*Etiqueta de Texto "Mensaje Cifrado"*/
        etiMensaje = new JLabel("Mensaje cifrado: ");
        etiMensaje.setBounds(250, 1, 200, 200);

        /*Campo del texto cifrado*/
        cMensajeD = new JTextField();
        cMensajeD.setBounds(250, 110, 200, 250);
        cMensajeD.setToolTipText("Este es su cifrado");

        /*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
        //ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+"/src/ico/fes/swing/cifrando.png"); ----> Esto no va
        btn = new JButton("CIFRAR");
        btn.setBounds(195, 380, 75, 30);
        btn.setToolTipText("Por favor de hacer clic para cifrar el mensaje");

        this.getContentPane().add(etiDesp);
        this.getContentPane().add(cDesplazar);
        this.getContentPane().add(cMensajeD);
        this.getContentPane().add(etIngresar);
        this.getContentPane().add(cMensaje);
        this.getContentPane().add(btn);
        btn.addActionListener(this);
        this.getContentPane().add(etiMensaje);

        this.validate();
        this.setVisible(true);

        /*Nota: Para que la ventana cierre directamente*/
        /*Declarar Adaptador para cerrar ventana*/
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }

    /*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
    /*Para la acción del boton CIFRAR*/
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == btn) {

            /*Declarar variables*/
            char caracter;
            String texto;
            String textoCodificado = "";

            /*Excepciones*/
            try {
                //*Todo el texto que escriban en el campo cMensaje sea igual a un String/Guardar en la variable texto*/
                texto = cMensaje.getText();
                /*Convertir el texto en minusculas*/
                texto = texto.toLowerCase();
                /*Analizar el argumento de cadena como un entero*/
                int clave = Integer.parseInt(cDesplazar.getText());

                /*Recorrer toda la cadena del texto.*/
                for (int i = 0; i < texto.length(); i++) {
                    /*Para devolver el carácter en el índice especificado de la cadena/texto*/
                    caracter = texto.charAt(i);
                    /*Para retornar el primer índice en el que se encuentra un elemento*/
                    int posicion = letras.indexOf(caracter);

                    /*Aquí se hace la magia del cifrado*/
                    /*Sí la posición es igual a -1*/
                    if (posicion == -1) {
                        /*Sumar el caracter y guardarlo en la variable textoCodificado*/
                        textoCodificado += caracter;
                    } else {
                        // concatenar
                        /*Sí no, sumar el texto codificado a las letras(posición +cadena de entero) % la longitud de las letras*/
                        textoCodificado += letras.charAt((posicion + clave) % letras.length());
                    }
                }
                /*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/
                /*Nota: Al dar clic en etiMensaje, saldrá el texto cifrado*/
                /*EtiMensaje: Devolver el texto el texto cifrado */
                cMensajeD.setText("" + textoCodificado);

            } catch (Exception ex) {

                /*Excepciones: Mandará un mensaje en caso de algún error por parte del usuario*/
                System.out.println(ex.toString());
                JOptionPane.showMessageDialog(null,
                        "Introducir los valores correctamente",
                        "Error de captura del texto",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
