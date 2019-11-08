
package examenlab1_sergiosuazo;

import java.util.ArrayList;
import java.util.Date;

public class Personas {
    private String usuario;
    private String contraseña;
    private Date fecha;
    private int telefono;
    private String correo;
    private String favorito;
    private ArrayList<Libros> lista=new ArrayList();

    public Personas() {
    }

    public Personas(String usuario, String contraseña, Date fecha, int telefono, String correo, String favorito) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
        this.favorito = favorito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public ArrayList<Libros> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libros> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Personas{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", fecha=" + fecha + ", telefono=" + telefono + ", correo=" + correo + ", favorito=" + favorito + ", lista=" + lista + '}';
    }
    
}
