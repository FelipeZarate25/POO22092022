/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Felipe Zarate
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* NOTA: Hice cosas de más profesor, espero no haya problema, por cierto, mi ubuntu falló profe,
        no ejecuta los programas, por eso lo subí desde Git Hub, espero comprenda, trate de resolverlo y no pude :( .*/
        
        /*Declaración del objeto*/
        Cuentahabiente[] habiente = new Cuentahabiente[5]; // Cinco Cuentahabientes
        
        habiente[0] = new Cuentahabiente(436368338,"Val Diaz G.",3500.0f);
        habiente[1] = new Cuentahabiente(436623438,"Jesus Goméz J.",65000.0f);
        habiente[2] = new Cuentahabiente(437365433,"Mario Estrada Z.",5000.0f);
        habiente[3] = new Cuentahabiente(436609865,"Karla Medina B.",82000.0f);
        habiente[4] = new Cuentahabiente(436765435,"Yahir Cruz M.",4500.0f);
        
        System.out.println("-----------------------------RETIRAR DINERO------------------------------");
        /*Imprimir en pantalla: Monto, Balance y Retiro(Resta del monto - balance)*/
        habiente[0].retirarDinero(2800);
        habiente[1].retirarDinero(55000);
        habiente[2].retirarDinero(4700);
        habiente[3].retirarDinero(8000);
        habiente[4].retirarDinero(4500);
        
        
        System.out.println("---------------------------------FOR EACH-----------------------------");
        /*NOTA: Profe, hice cosas de más, para practicar, espero no haya problema.*/
         
        for(Cuentahabiente cuentahabiente : habiente)
         {
             System.out.println("Id del Cliente: "+cuentahabiente.getIdCliente()+", "
                     +"Nombre del Cliente: "+cuentahabiente.getNombre()+", "
                             +" Balance del Cliente: $"+cuentahabiente.getBalance()+", "
                             +"Nivel del Cliente: "+cuentahabiente.evaluarNivelCliente());
         }                   
           
        /*Profesor, me cambió el comentario, por eso lo volví hacer otro commit*/
        
    }
    
}
