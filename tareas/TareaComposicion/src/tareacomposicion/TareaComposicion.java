/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import clases.Pelicula;
import clases.Libro;
import ico.componentes.libro.Autor;
import ico.componentes.libro.Editorial;
import ico.componentes.pelicula.Actor;
import ico.componentes.pelicula.Director;
import ico.componentes.pelicula.Productora;

/**
 *
 * @author felipezarate
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Espero haberlo hecho bien profesor :)
        
        //Llamando objeto y declarando variable
        Libro miLibro = new Libro();
        miLibro.setNombreLibro("El señor de los anillos");
        miLibro.setGenero("Literatura fantástica");
        
        miLibro.setAutor(new Autor(" J.J.J Tolkien", 81));
        miLibro.setEditorial(new Editorial("Ediciones Minotauro","Edición 60"));
        //Acá para imprimir el pantalla
        System.out.println(miLibro);
        
        System.out.println("\n"); //----------> Salto de línea
        
        /*>>>>>>>>> NOTA: Otra forma de imprimirlo en pantalla es: <<<<<<<<<<<<<*/
        /*Libro miLibro2 = new Libro("El señor de los anillos", "Literatura fantástica", 
                new Autor(" J.J.J Tolkien", 82),
                new Editorial("Ediciones Minotauro","Edición 62"));
        System.out.println(miLibro2);*/
     
        //Probando el metodo de uso general 
        //---->Profesor,imprimí mis metodos general para verPelicula como quedaba y experimentar más con composición, espero no haya problema.
        System.out.println("\t \t \t \t \t \t \t \tMetodos de uso general:");
       
        Autor autor = new Autor();
        autor.setNombreAutor("J.J.J Tolkien");
        autor.setEdad(81);
        
        Editorial editorial = new Editorial();
        editorial.setNombreEditorial("Ediciones Minotauro");
        editorial.setEdicion("Edición 60");
        
        
        System.out.println("Libro: ");
        miLibro.leerLibro();
        System.out.println("Autor: ");
        autor.escribirLibro();
        System.out.println("Editorial: ");
        editorial.describirLibro();
        
        
        System.out.println("Titulo del libro: " + miLibro.getNombreLibro());
        System.out.println("Género: " + miLibro.getGenero());
        System.out.println("Edad: " + autor.getEdad());
        System.out.println("Autor: " + autor.getNombreAutor());
        System.out.println("Nombre de la editorial: " + editorial.getNombreEditorial());
        System.out.println("Edición: \n" + editorial.getEdicion());
     
        
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        

        //Llamando objeto y declarando variable
        Pelicula miPelicula = new Pelicula();
        miPelicula.setTitulo("Spiderman No hay home");
        miPelicula.setGenero("Ciencia ficción");
        miPelicula.setDuracion(148);
        
        miPelicula.setPrincipal(new Actor("Thomas Stanley Holland", 25));
        miPelicula.setDirector(new Director("Jon Watts", "Fountain, Colorado, Estados Unidos"));
        miPelicula.setProductora(new Productora("Marvel Studios", "Sony Pictures"));
        //Acá para imprimir el pantalla
        System.out.println(miPelicula);
        
        System.out.println("\n"); //----------> Salto de línea
        
        
        /*>>>>>>>>> NOTA: Otra forma de imprimirlo en pantalla es:  <<<<<<<<<<<<<*/
        /*Pelicula miPeli2 = new Pelicula("Spiderman No hay home", "Ciencia ficción", 148,
                new Actor("Thomas Stanley Holland", 25),
                new Director("Jon Watts", "Fountain, Colorado, Estados Unidos"),
                new Productora("Marvel Studios", "Sony Pictures"));
        System.out.println(miPeli2);*/
        
        //NOTA: Probando mis metodos de uso general
        //---->Profesor, imprimí mis metodos general para verPelicula como quedaba y experimentar más con composición, espero no haya problema.
        System.out.println("\t \t \t \t \t \t \t \tMetodos de uso general:");

        Actor actor = new Actor();
        actor.setNombreActor("Thomas Stanley Holland");
        actor.setEdad(25);
        
        Director director = new Director();
        director.setNombreDirector("Jon Watts");
        director.setGentilicio("Fountain, Colorado, Estados Unidos");
        
        Productora productora = new Productora();
        productora.setNombreProductora("Marvel Studios");
        productora.setCompania("Sony Pictures");
       
        System.out.println("Pelicula: ");
        miPelicula.verPelicula();
        System.out.println("Actor: ");
        actor.actuar();
        System.out.println("Director: ");
        director.dirigir();
        System.out.println("Productora: ");
        productora.producir();
        
        
        System.out.println("Pelicula: " + miPelicula.getTitulo());
        System.out.println("Género: " + miPelicula.getGenero());
        System.out.println("Duración: " + miPelicula.getDuracion());
        System.out.println("Actor: " + actor.getNombreActor());
        System.out.println("Director: " + director.getNombreDirector());
        System.out.println("Productora: " + productora.getNombreProductora());
        
        
    }
    
}
