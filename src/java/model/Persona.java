package model;
// Generated Nov 24, 2016 2:14:55 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private String numeroDocumento;
     private String tipoDocumento;
     private String nombre;
     private String apellidop;
     private String apellidom;
     private char sexo;
     private Date fechaNacimiento;
     private String correo;
     private Date fechaModificacion;
     private Set usuarios = new HashSet(0);

    public Persona() {
    }

	
    public Persona(String numeroDocumento, String tipoDocumento, String nombre, String apellidop, String apellidom, char sexo, Date fechaNacimiento, String correo, Date fechaModificacion) {
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.fechaModificacion = fechaModificacion;
    }
    public Persona(String numeroDocumento, String tipoDocumento, String nombre, String apellidop, String apellidom, char sexo, Date fechaNacimiento, String correo, Date fechaModificacion, Set usuarios) {
       this.numeroDocumento = numeroDocumento;
       this.tipoDocumento = tipoDocumento;
       this.nombre = nombre;
       this.apellidop = apellidop;
       this.apellidom = apellidom;
       this.sexo = sexo;
       this.fechaNacimiento = fechaNacimiento;
       this.correo = correo;
       this.fechaModificacion = fechaModificacion;
       this.usuarios = usuarios;
    }
   
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidop() {
        return this.apellidop;
    }
    
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
    public String getApellidom() {
        return this.apellidom;
    }
    
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


