/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

/**
 *
 * @author felipezarate
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Tarea Libros: 5 Atributos y 2 Metodos 
        //Nota: Hice un programa con los atributos que tendria un libro
        
        System.out.println("\t AQUI MIS ATRIBUTOS");
        
        //Para mi libro
        //Llamar a mi clase Libro, miLibro(variable-objeto).
        Libro miLibro = new Libro();
        //Llamar atributos
        miLibro.setId(422012511);
        miLibro.setTitulo("Cien años de soledad ");
        miLibro.setAutor("Gabriel Garcia Marquez ");
        miLibro.setGenero("Novela ");
        miLibro.setSubgenero("Realismo magico ");
        miLibro.setEditorial("Editorial sudamericano ");
        miLibro.setAnio(1967);
        miLibro.setPaginas(471);
        //Imprimir pantalla
        System.out.println("ID del libro: " + miLibro.getId()); //Nota: Necesario en BD
        System.out.println("Titulo del libro: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Genero: " + miLibro.getGenero());
        System.out.println("Editorial: " + miLibro.getEditorial());
        System.out.println("Año de la publicacion: " + miLibro.getAnio());
        System.out.println("Paginas: "+ miLibro.getPaginas());

        
        //Mis metodos (Cuando vas por un libro)describir, leer y entregar.
        //Nota: Hice tres, espero no haya problema.
        System.out.println("\t \t \t \t \t \t \t \t AQUI MIS METODOS \n");
        
        //<<Llamar metodos(funcion) e imprimirlo en pantalla.>>
        miLibro.describir();
        miLibro.leer();
        miLibro.entregar();
        
        
    }
    
}
