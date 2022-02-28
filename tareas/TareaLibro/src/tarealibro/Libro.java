/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

import java.util.logging.Logger;

/**
 *
 * @author felipezarate
 */
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String subgenero;
    private String editorial;
    private int anio;
    private int paginas;
    private int Id;

    public Libro() {
    }

    public Libro(String titulo, String autor, String genero, String subgenero, String editorial, int anio, int paginas, int Id) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.subgenero = subgenero;
        this.editorial = editorial;
        this.anio = anio;
        this.paginas = paginas;
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    

    //Metodos solicitados
    public void describir(){
        System.out.println("El libro "+ this.titulo + "fue escrito por el famoso escritor "+this.autor+", es del genero de la "+this.genero+"y, como subgenero del "+this.subgenero+", con fecha de publicacion en "+this.anio);
    }
    
    public void leer(){
        System.out.println("Ahora estoy leyendo el libro del gran escritor " + this.autor+"publicado en la "+this.editorial+", que tiene "+this.paginas+" paginas y es un gran libro, se los recomiendo.");
    }
   
    public void entregar(){
        System.out.println("El Ingeniero Abraham tiene en su poder el libro "+this.titulo+"con codigo "+this.Id+" y aun no lo ha entregado");
    }
    
    
}
