package model;
// Generated Oct 30, 2016 1:24:18 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ExamenLaboratorio generated by hbm2java
 */
public class ExamenLaboratorio  implements java.io.Serializable {


     private BigDecimal codExamenLaboratorio;
     private String nombre;
     private String descripcion;
     private String indicacion;
     private char estado;
     private Set indicadors = new HashSet(0);

    public ExamenLaboratorio() {
    }

	
    public ExamenLaboratorio(BigDecimal codExamenLaboratorio, String nombre, String descripcion, String indicacion, char estado) {
        this.codExamenLaboratorio = codExamenLaboratorio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.indicacion = indicacion;
        this.estado = estado;
    }
    public ExamenLaboratorio(BigDecimal codExamenLaboratorio, String nombre, String descripcion, String indicacion, char estado, Set indicadors) {
       this.codExamenLaboratorio = codExamenLaboratorio;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.indicacion = indicacion;
       this.estado = estado;
       this.indicadors = indicadors;
    }
   
    public BigDecimal getCodExamenLaboratorio() {
        return this.codExamenLaboratorio;
    }
    
    public void setCodExamenLaboratorio(BigDecimal codExamenLaboratorio) {
        this.codExamenLaboratorio = codExamenLaboratorio;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getIndicacion() {
        return this.indicacion;
    }
    
    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set getIndicadors() {
        return this.indicadors;
    }
    
    public void setIndicadors(Set indicadors) {
        this.indicadors = indicadors;
    }




}

