package model;
// Generated Nov 21, 2016 7:45:14 AM by Hibernate Tools 4.3.1



/**
 * Cajero generated by hbm2java
 */
public class Cajero  implements java.io.Serializable {


     private String username;
     private Usuario usuario;
     private char estado;

    public Cajero() {
    }

    public Cajero(Usuario usuario, char estado) {
       this.usuario = usuario;
       this.estado = estado;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }




}


