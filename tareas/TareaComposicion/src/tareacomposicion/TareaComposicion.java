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
        
        //Para imprimir pantalla Libro
        Libro miLibro = new Libro();
        
        
        miLibro.setNombre("El señor de los anillos");
        miLibro.setGenero("Literatura fantástica");
        
        miLibro.setAutor(new Autor(" J.J.J Tolkien", 81));
        miLibro.setEditorial(new Editorial("Ediciones Minotauro","Edición 60"));
        System.out.println(miLibro);
        
        /*>>>>>>>>> Otras formas de imprimirlo en pantalla son: <<<<<<<<<<<<<*/
        
        /*Libro miLibro2 = new Libro("El señor de los anillos", "Literatura fantástica", 
                new Autor(" J.J.J Tolkien", 82),
                new Editorial("Ediciones Minotauro","Edición 62"));
        System.out.println(miLibro2);*/
        
        /*Libro miLibro3 = new Libro("El señor de los anillos", "Literatura fantástica", 
                new Autor(" J.J.J Tolkien", 81),
                new Editorial("Ediciones Minotauro","Edición 60"));
        miLibro3.getAutor().setNombre("El señor de los anillos 3");
        miLibro3.getAutor().setEdad(83);
        miLibro3.getEditorial().setNombreEditorial("Ediciones Minotauro 3");
        miLibro3.getEditorial().setEdicion("Edición 63");
        System.out.println(miLibro3);*/
        
        System.out.println("\t \t \t \t Metodos de uso general:");
       
        Autor autor = new Autor();
        autor.setNombre("J.J.J Tolkien");
        autor.setEdad(81);
        
        Editorial editorial = new Editorial();
        editorial.setNombreEditorial("Ediciones Minotauro");
        editorial.setEdicion("Edición 60");
        
        
        System.out.println("Libro: ");
        miLibro.leer();
        System.out.println("Autor: ");
        autor.escribir();
        System.out.println("Editorial: ");
        editorial.describir();
        
        
        System.out.println("Titulo del libro: " + miLibro.getNombre());
        System.out.println("Género: " + miLibro.getGenero());
        System.out.println("Edad: " + autor.getEdad());
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Nombre de la editorial: " + editorial.getNombreEditorial());
        System.out.println("Edición: \n" + editorial.getEdicion());
     
        
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        

        //Para imprimir pantalla Pelicula
        Pelicula miPelicula = new Pelicula();
        miPelicula.setTitulo("Spiderman No hay home");
        miPelicula.setGenero("Ciencia ficción");
        miPelicula.setDuracion(148);
        
        miPelicula.setPrincipal(new Actor("Thomas Stanley Holland", 25));
        miPelicula.setDirector(new Director("Jon Watts", "Fountain, Colorado, Estados Unidos"));
        miPelicula.setProductora(new Productora("Marvel Studios", "Sony Pictures"));
        System.out.println(miPelicula);
        
        System.out.println("\n"); //----------> Salto de línea
        
        /*>>>>>>>>> Otras formas de imprimirlo en pantalla son: <<<<<<<<<<<<<*/
        /*Pelicula miPeli2 = new Pelicula("Spiderman No hay home", "Ciencia ficción", 148,
                new Actor("Thomas Stanley Holland", 25),
                new Director("Jon Watts", "Fountain, Colorado, Estados Unidos"),
                new Productora("Marvel Studios", "Sony Pictures"));
        System.out.println(miPeli2);*/
        
        /*Pelicula miPeli3 = new Pelicula("Spiderman No hay home", "Ciencia ficción", 148,
                new Actor("Thomas Stanley Holland", 25),
                new Director("Jon Watts", "Fountain, Colorado, Estados Unidos"),
                new Productora("Marvel Studios", "Sony Pictures"));
        miPeli3.getPrincipal().setNombre("Thomas Stanley Holland");
        miPeli3.getPrincipal().setEdad(25);
        miPeli3.getDirector().setNombreDirector("Jon Watts");
        miPeli3.getDirector().setOrigen("Fountain, Colorado, Estados Unidos");
        miPeli3.getProductora().setNombreProductora("Marvel Studios");
        miPeli3.getProductora().setDistribucion("Sony Pictures");
        System.out.println(miPeli3);*/
        
        
        //System.out.println("\t \t \t \t \t \t \t \t Aquí para imprimir mis metodos de uso general \n");
        
        System.out.println("\t \t \t \t Metodos de uso general:");

        Actor actor = new Actor();
        actor.setNombre("Thomas Stanley Holland");
        actor.setEdad(25);
        
        Director director = new Director();
        director.setNombreDirector("Jon Watts");
        director.setOrigen("Fountain, Colorado, Estados Unidos");
        
        Productora productora = new Productora();
        productora.setNombreProductora("Marvel Studios");
        productora.setDistribucion("Sony Pictures");
       
        System.out.println("Pelicula: ");
        miPelicula.ver();
        System.out.println("Actor: ");
        actor.actuar();
        System.out.println("Director: ");
        director.dirigir();
        System.out.println("Productora: ");
        productora.producir();
        
        
        System.out.println("Pelicula: " + miPelicula.getTitulo());
        System.out.println("Género: " + miPelicula.getGenero());
        System.out.println("Duración: " + miPelicula.getDuracion());
        System.out.println("Actor: " + actor.getNombre());
        System.out.println("Director: " + director.getNombreDirector());
        System.out.println("Productora: " + productora.getNombreProductora());
        
        
    }
    
}
