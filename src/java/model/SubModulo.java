package model;
// Generated Nov 24, 2016 2:14:55 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * SubModulo generated by hbm2java
 */
public class SubModulo  implements java.io.Serializable {


     private BigDecimal codSubModulo;
     private Modulo modulo;
     private String nombre;
     private String direccion;
     private char estado;

    public SubModulo() {
    }

    public SubModulo(BigDecimal codSubModulo, Modulo modulo, String nombre, String direccion, char estado) {
       this.codSubModulo = codSubModulo;
       this.modulo = modulo;
       this.nombre = nombre;
       this.direccion = direccion;
       this.estado = estado;
    }
   
    public BigDecimal getCodSubModulo() {
        return this.codSubModulo;
    }
    
    public void setCodSubModulo(BigDecimal codSubModulo) {
        this.codSubModulo = codSubModulo;
    }
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }




}


