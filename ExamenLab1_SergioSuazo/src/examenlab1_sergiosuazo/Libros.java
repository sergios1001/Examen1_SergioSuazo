
package examenlab1_sergiosuazo;

import java.util.Date;


public class Libros {
    private String titulo;
    private String genero;
    private int copias;
    private int puntaje;
    private String descripcion;
    private int precio;
    private Date publicacion;
    private String autor;

    public Libros() {
    }

    public Libros(String titulo, String genero, int copias, int puntaje, String descripcion, int precio, Date publicacion, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.copias = copias;
        this.puntaje = puntaje;
        this.descripcion = descripcion;
        this.precio = precio;
        this.publicacion = publicacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
